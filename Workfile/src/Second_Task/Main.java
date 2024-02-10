package Second_Task;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //System.out.println("ID is: "+me.getId()+"; Balance is: "+me.getBalance()+"; AnnualInterestRate is: "+me.getAnnualInterestRate()+";");
        Person per = new Person(373727732,1000000,15);
        per.getMonthlyInterest();
        per.deposit(50000);
        per.withdraw(233433);

    }
}
