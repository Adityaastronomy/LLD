package Models;

import Interfaces.ParkingSpot;

public class MotorCycle extends ParkingSpot {
    @Override
    public boolean getIsFree() {
        // implement
        return false;
    }
}
