package PatternOne;

import java.util.ArrayList;
import java.util.Collection;
public class Main {
    public static void main(String[] args) {
        // Scorpio obj = new Scorpio();
        // obj.driveCar();


        // ScorpioFactory factory = new ScorpioFactory();
        // Scorpio car1 = factory.createScorpio('N');
        // car1.driveCar();
        // Scorpio car2 = factory.createScorpio('C');
        // car2.driveCar();
        // Scorpio car3 = factory.createScorpio('M');
        // car3.driveCar();

        Collection<Scorpio > list = new ArrayList<>();
        Scorpio car1 = new ScorpioN();
        Scorpio car2 = new ScorpioClassic();
        Scorpio car3 = new Scorpio();

        list.add( car1 );
        list.add( car2 );
        list.add( car3 );

        for( Scorpio car : list )
        {
            car.driveCar();
        }

    }
}
