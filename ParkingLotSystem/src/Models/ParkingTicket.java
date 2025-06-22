package Models;

import java.sql.Date;

import Interfaces.Payment;
import Interfaces.Vehicle;

public class ParkingTicket {
    private int ticketNo;
    private Date entryTimeStamp;
    private Date exitTimeStamp;
    private double Amount;
    private String vehicleNo;
    private boolean status;

    // relationship
    private Vehicle vehicle;
    private Payment payment;
    private Entrance entrance;
    private Exit exit;

}
