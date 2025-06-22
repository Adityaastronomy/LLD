package Models;

public class NoMoneyInsertedState implements IState {
    VendingMachine sys;

    NoMoneyInsertedState( VendingMachine machine )
    {
        sys = machine ;
    }
    @Override
    public void insertMoney( VendingMachine machine , double amount ) {
        // Validate the money and 
        // change the state -> moneyInsertedState
        // system.setState( system.getMoneyInsertedState());

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

    }   
   

}
