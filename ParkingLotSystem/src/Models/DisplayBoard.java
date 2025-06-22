package Models;
import java.util.*;

import Interfaces.ParkingSpot;
public class DisplayBoard {
    private int id;
    private Map< String , List< ParkingSpot >> parkingSpots;
    public DisplayBoard( int id )
    {
        this.id = id;
        this.parkingSpots = new HashMap();
    }
    public void showFreeSlot( )
    {
        // implement 
    }
    public void addParkingSpot( String spotType , List< ParkingSpot > spots )
    {
        // implement
    }   
    public void ParkingFullNotification()
    {
        // implement
    }
}
