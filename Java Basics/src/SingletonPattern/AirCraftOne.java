package SingletonPattern;

public class AirCraftOne {  
    private static AirCraftOne aircraftInstance;

    private AirCraftOne()
    {

    }
    public static AirCraftOne getInstance()
    {
        if( aircraftInstance == null )
        {
            aircraftInstance = new AirCraftOne();
        }
        return aircraftInstance;
    }
 
}   
