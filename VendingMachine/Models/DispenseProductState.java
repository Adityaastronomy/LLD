package Models;

public class DispenseProductState implements IState {
    private VendingMachine sys ;
    public DispenseProductState(VendingMachine machine ) 
    {
        sys = machine;
    }
        
    @Override
    public void insertMoney( VendingMachine machine , double amount ) {
        // Validate the money and change the state -> moneyInsertedState
    }   
    @Override
    public void pressButton( VendingMachine machine , int slotNumber ) {

    }   
    @Override
    public void returnChange( int amount ) {

    }   
    @Override
    public void updateInventory( VendingMachine machine , int slotNumber ) {

    }   
    @Override
    public void dispenseProduct( VendingMachine machine , int slotNumber ) {
        // After giving the product 
        // State change -> NoMoneyInsertedState
    }   
}
