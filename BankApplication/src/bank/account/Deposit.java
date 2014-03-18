package bank.account;

import bank.client.Customer;
import bank.technical.Timer;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Deposit extends Account {

    private double percent = 11;
    private double count;
    protected double balance;
    Percentage percentage;
    Customer customer;
    Timer timer = new Timer();
    List<Percentage> list = new LinkedList();

    @Override
    public void moneyIn(double in, Customer c) {
        
        balance = balance + in;
        percentage = new Percentage(in, count);
        list.add(percentage);

        System.out.println(" ");
        System.out.println("MoneyIn " + c.getName() + " " + in);
        System.out.println("Percent of contract " + getPercent() + "%");
        System.out.println("Money of percent " + getCountPercentage());
        
    }

    // @Override
    public void moneyOut(double out) {
        balance = balance - out;
        //percentage();
    }

    //private void percentage() {
    //  count = (balance / 100) * 11;
    //}
    private double bonus() {
        double bonus = Math.random() * 3;
        return bonus;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getPercent() {
        return percent;
    }

    public double getCountPercentage() {
        return percentage.getCountPercentage();
    }

    public double getFinalBalance() {
        double sum = 0;
        double tmp;
        for (Percentage x : list) {
            tmp = x.getCountPercentage();
            sum = sum + tmp;
        }
        return sum + balance;
    }

}
