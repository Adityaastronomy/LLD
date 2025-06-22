package MediatorPattern;

public class Indigo implements IAirCraft{
    ATCTower atcTower;
    public Indigo( ATCTower atcTower)
    {
        this.atcTower = atcTower;
    } 
    // kudh se land nhi karega aircraft kyu ki permission chaiye hoga aircraft ko
     
    @Override
    public void land() {
        System.out.println("I am Landing Indigo ");
    }
    // permission lega ATC
    public void requestPermissionForLanding( )
    {
        System.out.println("Calling ATC Tower method for permission ");
        // ATC Tower se permission lenge
        atcTower.requestToLand( this );
    }
}
