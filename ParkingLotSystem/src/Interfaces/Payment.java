package Interfaces;

import java.util.Date;

import Constants.PaymentStatus;

public abstract class Payment {
    private double amount;
    private PaymentStatus status;
    private Date timeStamp;
    private String transactionId;
    public abstract boolean initiateTransaction();
}
