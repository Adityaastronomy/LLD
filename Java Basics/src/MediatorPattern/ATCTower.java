package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ATCTower {
    // Before hand data hona chaye saare aircraft ka
    List<IAirCraft> queueForLanding = new ArrayList<>();

    synchronized public void requestToLand( IAirCraft airCraft )
    {           
        System.out.println("Inside ATC Tower ");
        if( queueForLanding.size() == 0 )
        {
            airCraft.land();
        }
        else
        {
            queueForLanding.add( airCraft );
        }
        
    }
}
