package Interfaces;

import Constants.AccountStatus;
import Models.Person;

public abstract class Account {
    private String username;
    private String password;
    private AccountStatus accountStatus;
    private Person person;
    public abstract boolean resetPassword();

}
