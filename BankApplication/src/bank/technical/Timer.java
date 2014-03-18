package bank.technical;

public class Timer {

    public void startTime(String month) throws InterruptedException {
        System.out.println(month);
        int i = 1;
        while (i < 2) {
            if (i < 2) {
                Thread.sleep(1000);
            }
            i++;
        }
    }

}
