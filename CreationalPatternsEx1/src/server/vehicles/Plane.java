package server.vehicles;

import server.Passenger;

public class Plane implements Vehicle {
    public Plane() {}

    @Override
    public void transport(Passenger passenger) {
        System.out.println("passenger's name is " + passenger.name +
                " and he had a successful transport on the plane");
    }

    @Override
    public VehicleType getType() {
        return VehicleType.PLANE;
    }
}
