
package bank.account;

import java.util.Timer;

public class Percentage {

    private double count;
    private double balance;
    Timer timer = new Timer();

    Percentage(double b, double c) {
        this.balance = b;
        this.count = c;
        percentage();
    }

    private void percentage() {
        //if(timer.getTime() == 12){
        count = (balance / 100) * 11;
        //}
    }
    
    public double getCountPercentage() {
        return count;
    }
    
    public double getBalance() {
        return balance;
    }

}
