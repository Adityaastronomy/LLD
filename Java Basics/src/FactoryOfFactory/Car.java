package FactoryOfFactory;

public class Car {
    IEngine engine;
    IVehicleFactory carfactory;
    Car( IVehicleFactory factory )
    {
        this.carfactory = factory;
    }
    public void driveCar()
    {
        engine = carfactory.createEngine();
        System.out.println("Create Car ");
    }
}

