package MODELS;

import java.util.List;

public class Building {
    private List< Floor> floors;
    private List< Elevator> elevators;

    private Building()
    {

    }
    // Singleton pattern
    
    public static Building buildingInstance = null;
    public static Building getInstance()
    {
        if( buildingInstance == null )
        {
            buildingInstance = new Building();
        }
        return buildingInstance;
    }

}
