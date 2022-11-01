package server;

import server.vehicles.*;

public class VehiclesFactory {
    private static VehiclesFactory instance;

    public VehiclesFactory() {
    }

    private static VehiclesFactory getInstance(){
        if(VehiclesFactory.instance == null){
            instance = new VehiclesFactory();
        }
        return instance;
    }

    public Vehicle provideVehicle(VehicleType vehicleType){
        switch (vehicleType){
            case PLANE:
                return new Plane();
            case BUS:
                return new Bus();
            case TAXI:
                return new Taxi();
            case BOAT:
                return new Boat();
            default:
                throw new IllegalArgumentException(String.format("Vehicle type not supported: %s", vehicleType));
        }
    }
}
