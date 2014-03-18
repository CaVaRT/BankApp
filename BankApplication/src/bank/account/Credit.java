package bank.account;


import bank.client.Customer;

public class Credit extends Account {

    protected double percent = 15;
    private double balance;
    public final double normaBalance = 1000;

    @Override
    public void moneyIn(double in, Customer c) {
        balance = balance + in;
    }

   // @Override
    public double moneyOut() {
        return normaBalance;
    }

    void percentage() {

    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double getPercent() {
        return percent;
    }

}
