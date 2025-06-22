package Transport;

public class Vehicle {
    public String name;
    public int noOfTyres;
    public String model;

    // Constructor
    public Vehicle() 
    {
        System.out.println("Paramterised Vehicle constructor is called having " );
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }
        
    public Vehicle( String name , String model , int noOfTyres )
    {
        System.out.println("Paramterised Vehicle constructor is called having " + name + " " + model );
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }
    public void start_engine()
    {
        System.out.println("Engine of the vehicle is started having " + name + " " + model );;
    }
    public void stop_engine()
    {
        System.out.println("Engine of the vehicle is stopped having " + name + " " + model );
    }
}
