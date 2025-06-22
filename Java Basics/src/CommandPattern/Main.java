package CommandPattern;

public class Main {

    public static void main(String[] args) {

        // Stting up 

        BreakMechanism breakMechanism = new BreakMechanism();
        AirSuspensionMechanisn airSuspensionMechanisn = new AirSuspensionMechanisn();

        EngageBreakCommand breakCommand = new EngageBreakCommand(breakMechanism);

        AirSuspensionCommand airSuspensionCommand = new AirSuspensionCommand(airSuspensionMechanisn);


        Panel btnPanel = new Panel();
        btnPanel.setCommand( 0 , airSuspensionCommand );
        btnPanel.setCommand( 1 , breakCommand );

        // Try different buttion
        btnPanel.liftSuspension();
        btnPanel.applyBreak();
    }
    
}
