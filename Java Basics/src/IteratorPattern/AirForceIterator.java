package IteratorPattern;

import java.util.LinkedList;
import java.util.List;



public class AirForceIterator implements CustomIterator {
    // main logic is here
    // how to iterate in different type of objects

    List< IAirCraft > jets;
    IAirCraft[] helis;
    LinkedList< Boeing > cargo;

    int jetsPos = 0;
    int helisPos = 0 ;
    int cargoPos = 0 ;


    public AirForceIterator( AirForce airForce )
    {
        this.jets = airForce.getJets();
        this.helis = airForce.getHelis();
        this.cargo = airForce.getCargo();
    }

    @Override
    public IAirCraft next() {
        // return the current element and goes to next element if there is any
        if( helisPos < helis.length)
        {
            return helis[ helisPos ++ ];
        }
        if( jetsPos < jets.size())
        {
            return jets.get( jetsPos ++ );
        }
        if( cargoPos < cargo.size())
        {
            return cargo.get(cargoPos++ );
        }
        else
        {
            // next element not available
            throw new RuntimeException("No More Element ");
        }
    }
    @Override
    public boolean hasNext() {
        return ( helis.length > helisPos ) || ( jets.size() > jetsPos ) || ( cargo.size() > cargoPos );
    }
}
