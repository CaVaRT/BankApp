package bank.account;

import bank.client.Customer;
import bank.technical.Timer;

public abstract class Account {

    protected double balance;

    abstract double getBalance();

    abstract double getPercent();

    abstract void moneyIn(double in, Customer c, String m);

}
