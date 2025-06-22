package Models;

import Interfaces.ParkingSpot;

public class Compact extends ParkingSpot{
    @Override
    public boolean getIsFree() {
        // logic if new 
        return false;
    }
}
