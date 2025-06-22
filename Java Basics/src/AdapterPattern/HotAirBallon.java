package AdapterPattern;

public class HotAirBallon {
    String gasUsed = "LPG";
    void start( String gas )
    {
        System.out.println("Hot Air Ballon is starting ");
    }

    String getGasUsed()
    {
        return gasUsed;
    }
}
