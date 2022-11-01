package server.vehicles;

import server.Passenger;

public class Boat implements Vehicle {
    public Boat(){}

    @Override
    public void transport(Passenger passenger) {
        System.out.println("passenger's name is " + passenger.name +
                " and he had a successful transport on the boat");
    }

    @Override
    public VehicleType getType() {
        return VehicleType.BOAT;
    }
}
