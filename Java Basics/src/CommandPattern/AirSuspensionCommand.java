package CommandPattern;

public class AirSuspensionCommand implements Command {
    AirSuspensionMechanisn airSuspensionMechanisn;
    AirSuspensionCommand( AirSuspensionMechanisn airSuspension )
    {
        this.airSuspensionMechanisn = airSuspension;
    }
    @Override
    public void execute() {
        airSuspensionMechanisn.liftSuspension();
    }

}
