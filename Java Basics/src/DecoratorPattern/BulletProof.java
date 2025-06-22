package DecoratorPattern;

public class BulletProof extends ScorpioDecorator{
    ICar scorpio;
    public BulletProof( ICar meriScorpio )
    {
        this.scorpio = meriScorpio;
    }
    // same 
    @Override
    public void start() {
        scorpio.start();
    }
    @Override
    public void stop() {
        scorpio.stop();
    }
    // update happens
    @Override
    public float getWeight() {
        return ( 300f + scorpio.getWeight());
    }
}
