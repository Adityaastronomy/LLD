package MODELS;

public class ElevatorSystem {
    private Building building;
    public void monitoring()
    {
        // implement
    }
    public void dispatcherAlgo()
    {
        // implement
    }
    private ElevatorSystem()
    {

    }
    public static ElevatorSystem elevatorSystemInstance = null;
    public static ElevatorSystem getInstance()
    {
        if( elevatorSystemInstance == null )
        {
            elevatorSystemInstance = new ElevatorSystem();
        }
        return elevatorSystemInstance;
    }
}
