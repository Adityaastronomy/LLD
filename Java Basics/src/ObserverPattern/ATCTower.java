package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ATCTower implements ISubject{
    List< IObserver > observers = new ArrayList<>();
    @Override
    public void addObserver(IObserver observer) {
        System.out.println("Subscibed in Tower ");
        observers.add( observer );
    }
    @Override
    public void removeObserver(IObserver observer) {
        System.out.println("Un-Subscribed in Tower ");
        observers.remove(observer);
    }
    @Override
    public void notifyObserver() {
        for( IObserver observer : observers )
        {
            // Apply some logic for them
            observer.proceed(this);
        }
    }
}
