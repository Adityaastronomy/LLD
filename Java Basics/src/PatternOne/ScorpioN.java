package PatternOne;

import Models.ScorpioNBodyShell;
import Models.ScorpioNEngine;

public class ScorpioN extends Scorpio{
    // override
    @Override 
    public void makeScorpio()
    {
        System.out.println("Scorpio N class me hun ");
        this.engine = new ScorpioNEngine();
        this.bodyShell = new ScorpioNBodyShell();

    }
    public void driveCar()
    {
        makeScorpio();
        System.out.println("I am Driving a ScorpioN ");
    }

}
