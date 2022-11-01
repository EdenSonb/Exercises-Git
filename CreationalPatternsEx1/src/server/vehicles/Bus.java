package server.vehicles;

import server.Passenger;

public class Bus implements Vehicle {
    public Bus() {}

    @Override
    public void transport(Passenger passenger) {
        System.out.println("passenger's name is " + passenger.name +
                " and he had a successful transport on the bus");
    }

    @Override
    public VehicleType getType() {
        return VehicleType.BUS;
    }
}
