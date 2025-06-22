package AdapterPattern;

public class Adapter implements ICar{
    HotAirBallon hotAirBallon;
    public Adapter( HotAirBallon ballon )
    {
        this.hotAirBallon = ballon;
    }
    public void start()
    {
        String gasToBeUsed = hotAirBallon.getGasUsed();
        hotAirBallon.start(gasToBeUsed);
    }   
}
