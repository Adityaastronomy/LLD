package Models;

import java.util.List;

public class VendingMachine {
    private NoMoneyInsertedState noMoneyState = new NoMoneyInsertedState(  this );
    private MoneyInsertedState moneryState = new MoneyInsertedState( this );
    private DispenseProductState dispenseState = new DispenseProductState( this );

    private IState state ;

    public void setState( IState newState )
    {
        state = newState;
    }   
    
    public NoMoneyInsertedState getNoMoneyInsertedState( )
    {
        return noMoneyState;
    }
    public MoneyInsertedState getmoneyInsertedState( )
    {
        return moneryState;
    }
    public DispenseProductState getDispenseProductState( )
    {
        return dispenseState;
    }

    private List< Slot > slots;
    private List< Slot > availabelSlots;
    private int CollectedCash;
    private List<Admin > opertors;
    private List< Product > productList;

    public void selectProduct( Slot slotNo)
    {

    }
    public void insertAmount( int amount )
    {

    }
    public void releaseProduct( Slot slotNo )
    {

    }
    public void returnChange(int amount )
    {

    }
    public void showErrorMessage( String content )
    {

    }
    public void updateInventory( Slot slotNo)
    {

    }
    public void addAdmin( Admin newAdmin)
    {

    }
    public void removeAdmin( Admin admin) 
    {

    }
    public void openCash( )
    {

    }
    public void searchProduct( Product item )
    {

    }
    // Singleton pattern 
    private static VendingMachine machineInstance = null;

    private VendingMachine( )
    {
        

    }
    public static VendingMachine getInstance()
    {
        if( machineInstance == null )
        {
            machineInstance = new VendingMachine();
        }

        return machineInstance;
    }


}
