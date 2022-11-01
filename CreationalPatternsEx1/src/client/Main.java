package client;

import server.Agency;
import server.Passenger;
import server.vehicles.VehicleType;

public class Main {
    private static Agency agency;
    public static void main(String[] args) {
        agency = new Agency();

        Passenger[] passengers = new Passenger[20];

        for (int i = 0; i < 20; i++) {
            passengers[i] = new Passenger("passenger " + (i+1), VehicleType.getRandomVehicleType());
            System.out.println(passengers[i].toString());
        }
        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            agency.assignPassengerToVehicle(passengers[i]);
        }

        System.out.println("\n");
        agency.checkVehiclesAvailable();
        System.out.println("\n");

        for (int i = 10; i < 17; i++) {
            agency.assignPassengerToVehicle(passengers[i]);
        }

        System.out.println("\n");
        agency.checkVehiclesAvailable();
    }
}
