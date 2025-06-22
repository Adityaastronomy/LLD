package Transport;

public class MotorCycle extends Vehicle{
    public String handleBarStyle;
    public String suspensionType;
    public void wheelie()
    {
        System.out.println("MotorCycle is doing wheelie " + name + " " + model );
    }
    public MotorCycle( String name , String model ,int noOfTyres ,  String handleBarStyle , String suspemstionType )
    {
        super( name , model , noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspemstionType;
    }
}
