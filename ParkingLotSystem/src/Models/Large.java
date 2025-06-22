package Models;

import Interfaces.ParkingSpot;

public class Large extends ParkingSpot{
    @Override
    public boolean getIsFree() {
        // implements 
        return false;
    }
}
