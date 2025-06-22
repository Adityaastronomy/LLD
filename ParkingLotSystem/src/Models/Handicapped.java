package Models;

import Interfaces.ParkingSpot;

public class Handicapped extends ParkingSpot {
    @Override
    public boolean getIsFree() {
        // implement 
        return false;
    }
}
