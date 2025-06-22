package PatternOne;

import Models.ScorpioClassicBodyShell;
import Models.ScorpioClassicEngine;

public class ScorpioClassic extends Scorpio {
    // override
    @Override
    public void makeScorpio()
    {
        System.out.println("Scorpio Classic Car me hun");
        this.engine = new ScorpioClassicEngine();
        this.bodyShell = new ScorpioClassicBodyShell();

    }
    public void driveCar()
    {
        makeScorpio();
        System.out.println("I am Driving a Scorpio Classic");
    }
}
