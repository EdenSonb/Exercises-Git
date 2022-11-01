package server.vehicles;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public enum VehicleType {
    PLANE, BUS, TAXI, BOAT;

    private static final List<VehicleType> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();

    public static VehicleType getRandomVehicleType()  {
        return VALUES.get(ThreadLocalRandom.current().nextInt(SIZE));
    }
}
