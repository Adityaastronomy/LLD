package BridgePattern;

public abstract class AbstractScorpio {
    // Bridge
    AbstractScorpioImpl scorpioImpl;
    public AbstractScorpio( AbstractScorpioImpl src )
    {
        this.scorpioImpl = src;
    }
    abstract boolean isRightHanded();
    abstract void printSafetyReq();

}
