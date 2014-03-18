package bank.client;

import bank.account.Credit;
import bank.account.Deposit;

public class Customer {

    private final String name;
    Credit credit = new Credit();
    Deposit deposit = new Deposit();

    Customer(String n) {
        this.name = n;
    }

    public void infoDeposit() {
        System.out.println(" ");
        System.out.println(this.name);
        System.out.println("Info Deposit");
        System.out.println("Balance " + deposit.getBalance());
        System.out.println("Final balance " + deposit.getFinalBalance());

    }

    public void infoCredit() {
        System.out.println(" ");
        System.out.println("Info Credit");
        System.out.println(this.name);
        System.out.println("Balance " + credit.getBalance());
        System.out.println("Money in should " + (credit.normaBalance - credit.getBalance()));
        System.out.println("Percent of contract " + credit.getPercent());

    }

    public String getName() {
        return name;
    }

}
