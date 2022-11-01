package server.vehicles;

import server.Passenger;

public class Taxi implements Vehicle {
    public Taxi() {}

    @Override
    public void transport(Passenger passenger) {
        System.out.println("passenger's name is " + passenger.name +
                " and he had a successful transport on the taxi");
    }

    @Override
    public VehicleType getType() {
        return VehicleType.TAXI;
    }
}