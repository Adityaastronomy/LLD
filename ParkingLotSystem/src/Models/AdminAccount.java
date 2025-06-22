package Models;

import Interfaces.Account;
import Interfaces.ParkingSpot;

public class AdminAccount extends Account  {
    @Override
    public boolean resetPassword() {
        // implement
        return false;
    }
    public boolean addParkingSpot( ParkingSpot spot )
    {
        // implement
        return false;
    }
    public boolean addEntrance( Entrance entrance )
    {
        // implement
        return false;
    }
    public boolean addExit( Exit exit )
    {
        // inplement
        return false;
    }
    public boolean addDisplayBoard( DisplayBoard board )
    {
        // inplement
        return false;
    }
}
