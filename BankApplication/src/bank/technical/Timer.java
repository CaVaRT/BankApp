package bank.technical;

public class Timer {

    private int monthNumber;

    public int startTime(String month) throws InterruptedException {

        int i = 0;
        
        switch (month) {
            case "January":
                i = 1;
                break;
            case "February":
                i = 2;
                break;
            case "March":
                i = 3;
                break;
            case "April":
                i = 4;
                break;
            case "May":
                i = 5;
                break;
            case "June":
                i = 6;
                break;
            case "July":
                i = 7;
                break;
            case "August":
                i = 8;
                break;
            case "September":
                i = 9;
                break;
            case "October":
                i = 10;
                break;
            case "November":
                i = 11;
                break;
            case "December":
                i = 12;
                break;
        }

        i = 13 - i;
        monthNumber = i;

        while (i < 13) {
            if (i < 13) {
                Thread.sleep(1000);
                System.out.println(i);
            }
            i++;
        }      
        return monthNumber;
    }
    

    public int getI() {
        System.out.println("month2 " + monthNumber);
        return monthNumber;
    }

}
