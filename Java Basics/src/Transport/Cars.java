package Transport;

public class Cars extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    // constructor
    public Cars( String name , String model , int noOfTyres , int noOfDoors , String transmissionnType )
    {
        // super() // this will call the default constructor of supper class 
        super( name , model , noOfTyres );
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionnType;
        System.out.println( "Paramterised Constructor of the Cars is called having " + name + " " + model );
    }
    public void startAC()
    {
        System.out.println("AC of the car having " + name + " " + model );
    }
}       
