package server;

import server.vehicles.Vehicle;
import server.vehicles.VehicleType;
import java.util.HashMap;
import java.util.Map;

public class Agency {
    private Map<VehicleType, Integer> currentAmount;
    private Map<Vehicle, Passenger> vehiclePassenger;

    private static Agency instance;
    private static VehiclesFactory vehiclesFactory;

    public Agency(){
        currentAmount = new HashMap<>();
        currentAmount.put(VehicleType.PLANE, 1);
        currentAmount.put(VehicleType.BUS, 4);
        currentAmount.put(VehicleType.TAXI, 8);
        currentAmount.put(VehicleType.BOAT, 3);

        vehiclePassenger = new HashMap<>();
        vehiclesFactory = new VehiclesFactory();
    }

    private static Agency getInstance(){
        if(Agency.instance == null){
            instance = new Agency();
        }
        return instance;
    }

    public void assignPassengerToVehicle(Passenger passenger){
        if(checkNumAvailableVehicles() == 0){
            noAvailableVehicles();
            return;
        }
        VehicleType type = passenger.favoriteVehicle;;
        if(currentAmount.get(type) > 0){
            System.out.println("Passenger " + passenger.name + " got his favorite vehicle - " + type);
        } else {
            type = getRandomVehicleType();
            System.out.println("Passenger " + passenger.name +
                                " didn't get his favorite vehicle - " + passenger.favoriteVehicle +
                                ", but got " + type);
        }
        currentAmount.put(type, currentAmount.get(type) - 1);
        vehiclePassenger.put(vehiclesFactory.provideVehicle(type), passenger);
    }

    private VehicleType getRandomVehicleType(){
        VehicleType randomVehicleType;
        do {
            randomVehicleType = VehicleType.getRandomVehicleType();
        }
        while (currentAmount.get(randomVehicleType) <= 0);
        return randomVehicleType;
    }

    private int checkNumAvailableVehicles(){
        return currentAmount.values().stream().reduce(0, Integer::sum);
    }

    private void noAvailableVehicles(){
        System.out.println("\nThere are no more vehicles available\n");
        vehiclePassenger.forEach(((vehicle, passenger) -> vehicle.transport(passenger)));
    }

    public void checkVehiclesAvailable(){
        for (VehicleType vehicleType : currentAmount.keySet()){
            System.out.println("There are " + currentAmount.get(vehicleType) + " " + vehicleType +" available");
        }
    }
}
