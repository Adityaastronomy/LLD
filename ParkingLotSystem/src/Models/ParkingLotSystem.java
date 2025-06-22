package Models;

import java.util.HashMap;
import java.util.Map;

import Interfaces.ParkingSpot;
import Interfaces.Vehicle;

public class ParkingLotSystem {
    private int id;
    private String name;
    private String address;
    private HashMap< String , Entrance > entrance;
    private HashMap< String , Exit > exit;
    private ParkingRate parkingRate;
    private Map< String , DisplayBoard > DisplayBoard;
    private Map< String , ParkingTicket > parkingTickets;
    private Map< String , ParkingSpot > parkingSpots;   // -> individual count of motorcycle , compact, large , hanidcapped
    private final int MAX_CAPACITY  = 400000;

    // Singleton Design Pattern by marking a Constructor as Private 
    private ParkingLotSystem() 
    {

    }
    private static ParkingLotSystem parkingLot = null;
    public static ParkingLotSystem getInstance()
    {
        if( parkingLot == null )
        {
            parkingLot = new ParkingLotSystem();
        }
        return parkingLot;
    }

    public ParkingTicket getParkingTicket( Vehicle vehicle )
    {
        // add your implementation 
        return null;
    }
    public boolean isFull( )
    {
        // implement
        // call function 
        return false;
    }
    public boolean addEntrance( Entrance entrance )
    {

        // call admin wala function
        return false;
    }
    public boolean addExit( Exit exit )
    {
        // call admin wala func
        return false;
    }
}
