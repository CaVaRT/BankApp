package bank.account;

import bank.client.Customer;
import bank.technical.Timer;
import java.util.*;

public class Deposit extends Account {

    private double percent = 11;
    private double count;
    protected double balance;
    private int bonus;
    Percentage percentage;
    Customer customer;
    Timer timer = new Timer();
    List<Percentage> list = new LinkedList();

    @Override
    public void moneyIn(double in, Customer c, String m) {
        balance = balance + in;
        System.out.println(" ");
        System.out.println("MoneyIn " + c.getName() + " " + in + " on " + m);
        System.out.println("Percent of contract " + getPercent() + "%");
        percentage = new Percentage(in, count, m);
        list.add(percentage);
        System.out.println("Money of percent " + getCountPercentage());
        System.out.println("Your bonus " + bonus() + "%");
    }

    public void moneyOut(double out) {
        balance = balance - out;
    }

    private int bonus() {
        bonus = (int) Math.round(Math.random() * 3);
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
        return sum + balance + ((balance / 100) * bonus);
    }

}
