
package bank.account;

import bank.technical.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Percentage {

    private double count;
    private double balance;
    String month;
    Timer timer = new Timer();

    Percentage(double b, double c, String m) {
        this.balance = b;
        this.count = c;
        this.month = m;
        percentage();
    }

    private void percentage() {
        //if(timer.getTime() == 12){
        try {
            timer.startTime(month);
        } catch (InterruptedException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
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
