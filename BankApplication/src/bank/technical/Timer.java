package bank.technical;

public class Timer {

    public void startTime() throws InterruptedException {
        int i = 1;
        while (i < 13) {
            if (i < 13) {
                Thread.sleep(1000);
            }
            i++;
        }
    }

}
