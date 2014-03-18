package bank.client;

import java.util.HashMap;

public class BankApp {

    public static void main(String[] args) {
        Customer alex = new Customer("Alex");
        Customer diana = new Customer("Diana");

        HashMap<Integer, Customer> dataCustomers = new HashMap<>();
        dataCustomers.put(1, alex);
        dataCustomers.put(2, diana);

        alex.deposit.moneyIn(200, alex);
        //diana.deposit.moneyIn(250, diana);
        //alex.deposit.moneyIn(300, alex);

        dataCustomers.get(1).infoDeposit();
        //dataCustomers.get(2).infoDeposit();

    }

}
