package server.vehicles;

import server.Passenger;

public interface Vehicle {
    public void transport(Passenger passenger);
    public VehicleType getType();
}
