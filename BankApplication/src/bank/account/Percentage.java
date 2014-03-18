
package bank.account;

import bank.technical.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            timer.startTime();
        } catch (InterruptedException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double getCountPercentage() {
        return count;
    }
    
    public double getBalance() {
        return balance;
    }

}
