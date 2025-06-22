package Prototype;

public class Scorpio implements IScorpioPrototype {
    // default Engine
    ScorpioEngine engine = new ScorpioEngine();
    public Scorpio()
    {
        // private engine
        this.engine = new ScorpioEngine();
    }
    private Scorpio( ScorpioEngine scorpioEngine )
    {
        // deep copy ban rha hain 
        this.engine = new ScorpioEngine( scorpioEngine );
    }
    @Override
    public void start() {
        System.out.println("Start ho gayi Scorpio ");
    }
    @Override
    public IScorpioPrototype clone()
    {
        // return new Scorpio();
        IScorpioPrototype cloneScorpio = new Scorpio( this.engine );
        return cloneScorpio;
    }
    @Override
    public void setEngine(ScorpioEngine eng) {
        this.engine = eng;
    }

}
