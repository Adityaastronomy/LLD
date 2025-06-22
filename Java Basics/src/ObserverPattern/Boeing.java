package ObserverPattern;

public class Boeing  implements IAirCraft , IObserver{
    // implements both aircraft and observer because it is both in nature

    ISubject tower ;
    public Boeing(ISubject tower )
    {
        this.tower = tower;
    }
    @Override
    public void land() {
        // land karne ke baad unsubscribe kardo
        System.out.println("Landed Successfully");
        tower.removeObserver( this );
    }
    @Override
    public void fly() {
        tower.addObserver(this);
        System.out.println( "Take Off Successfully");
    }
    @Override
    public void proceed(Object newState) {
        // Customer logic 
        System.out.println("I am executing the proceed method of aircraft");
    }
}
