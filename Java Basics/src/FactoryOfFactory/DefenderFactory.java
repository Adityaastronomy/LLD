package FactoryOfFactory;

public class DefenderFactory implements IVehicleFactory{
    public IEngine createEngine()
    {
        System.out.println("Defender ka Engine Bana Rha hun");
        return new DefenderEngine();
    }
}
