package Models;

import Interfaces.Payment;

public class CardPayment extends Payment {
    @Override
    public boolean initiateTransaction() {
        // implementation
        return true;
    }
}
