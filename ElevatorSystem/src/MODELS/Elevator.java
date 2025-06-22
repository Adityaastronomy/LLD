package MODELS;

import Constants.ElevatorStatus;

public class Elevator {
    private int id;
    private Door door;
    private ElevatorStatus state;
    private Display display;
    private ElevatorPanel panel;
    private Floor currentFloor;
    // it is constant 
    private final int maxCapacity = 650;

    public void openDoor()
    {
        // implement
    }
    public void closeDoor()
    {
        // implement

    }
    public void move()
    {
        // implement

    }
    public void stop()
    {
        // implement

    }
}
