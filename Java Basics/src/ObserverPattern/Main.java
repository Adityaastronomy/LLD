package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        // Tower phele
        ATCTower tower = new ATCTower();

        // Boeing 
        Boeing boeing1 = new Boeing( tower );
        Boeing boeing2 = new Boeing( tower );
        Boeing boeing3 = new Boeing( tower );
        Boeing boeing4 = new Boeing( tower );
        Boeing boeing5 = new Boeing( tower );
        boeing1.fly();
        boeing2.fly();
        boeing3.fly();
        boeing4.fly();
        boeing5.fly();
        tower.notifyObserver();
        boeing1.land();
        boeing2.land();
        boeing3.land();
        boeing4.land();
        boeing5.land();
    }
}
