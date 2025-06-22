package BuilderPattern;

public class ScorpioBuilder implements ICarBuilder {
    Scorpio s1;
    @Override
    public void buildEngine()
    {
        System.out.println("Scorpio Engine getting inserted ");
    }
    @Override
    public void buildChassis()
    {
        System.out.println("Scorpio Chassis getting inserted ");

    }
    @Override

    public void buildBodyShell()
    {
        System.out.println("Scorpio Body Shell getting inserted ");

    }
    @Override

    public void buildTyre()
    {
        System.out.println("Scorpio Tyre getting inserted ");

    }
    @Override

    public ICar build()
    {
        // s1 = new Scorpio();
        System.out.println("Scorpio Tayar hai le jao ");
        return s1;
    }
}
