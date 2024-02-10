package Second_Task;
public class Person {
    private int id;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    private int balance;
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    private int annualInterestRate;
    public int getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(int AnnualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public Person(int ID,int balance,int annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public void getMonthlyInterestRate(){
        System.out.println(annualInterestRate/12);
    }
    public void getMonthlyInterest(){
        System.out.println(((balance*annualInterestRate)/100)/12);
    }
    public void withdraw(double amount){
        System.out.println(balance-amount);
    }
    public void deposit(double amount){
        System.out.println(balance+amount);
    }
}
