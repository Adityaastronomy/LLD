package FlyweightPattern;

public class Tejas implements IAirCraft {
    // intrinsic property

    private final String name = "Tejas";
    private final int seater = 2;
    private final String dimension = "15 m long 4m wide ";
    private final String wingSpan = "40 feet";

    // extrinsic Property
    public double getTotalTimeToReachDest( int srcx , int srcy , int desx , int desy ,int speed)
    {       
        return 5;
    }   
}
