package Models;

import Interfaces.Payment;

public class CashPayment extends Payment{
    @Override
    public boolean initiateTransaction() {
        // implement 
        return true;
    }
}
