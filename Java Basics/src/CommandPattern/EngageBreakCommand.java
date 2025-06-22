package CommandPattern;

public class EngageBreakCommand implements Command{
    BreakMechanism breakMechanism;

    public EngageBreakCommand ( BreakMechanism breakii )
    {
        this.breakMechanism = breakii;
    }

    @Override
    public void execute() {
        breakMechanism.applyBreak();
    }
}   
