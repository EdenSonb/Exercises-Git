package server;

import server.vehicles.Vehicle;
import server.vehicles.VehicleType;

public class Passenger {
    public String name;
    public VehicleType favoriteVehicle;

    public Passenger(String name, VehicleType favoriteVehicle){
        this.name = name;
        this.favoriteVehicle = favoriteVehicle;
    }

    @Override
    public String toString(){
        return "Passenger { name : " + name + ", favorite vehicle : " + favoriteVehicle + " }";
    }
}
