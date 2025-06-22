package FactoryOfFactory;

public class ScorpioFactory implements IVehicleFactory{
    public IEngine createEngine()
    {
        System.out.println("Scorpio ka Engine bana rha hun ");
        return new ScorpioEngine();
    }
}
