package bank.technical;

public class Timer {

    private int monthNumber;

    public int startTime(String month) throws InterruptedException {

        int i = 0;

        switch (month) {
            case "January":
                i = 12;
                break;
            case "February":
                i = 11;
                break;
            case "March":
                i = 10;
                break;
            case "April":
                i = 9;
                break;
            case "May":
                i = 8;
                break;
            case "June":
                i = 7;
                break;
            case "July":
                i = 6;
                break;
            case "August":
                i = 5;
                break;
            case "September":
                i = 4;
                break;
            case "October":
                i = 3;
                break;
            case "November":
                i = 2;
                break;
            case "December":
                i = 1;
                break;
        }

       // i = 13 - i;
        monthNumber = i;

        while (i < 13) {
            if (i < 13) {
                Thread.sleep(100);
            }
            i++;
        }
        return monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

}
