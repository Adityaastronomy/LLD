package Models;

public class MoneyInsertedState implements IState{
    private VendingMachine sys ;

    public MoneyInsertedState( VendingMachine machine )
    {
        sys = machine ;
    }
    @Override
    public void insertMoney( VendingMachine machine , double amount ) {

    }   
    @Override
    public void pressButton( VendingMachine machine , int slotNumber ) {
        // Search for the prduct 
        // If available 
        // Validate the money 
        // Then change the state -> dispense State

    }   
    @Override
    public void returnChange( int amount ) {

    }   
    @Override
    public void updateInventory( VendingMachine machine , int slotNumber ) {

    }   
    @Override
    public void dispenseProduct( VendingMachine machine , int slotNumber ) {
        
    }   
}
