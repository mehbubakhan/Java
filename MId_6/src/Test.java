class BankAccount{
    private String name;
    private double balance;
    BankAccount(String _name, double initialDeposit){
        name = _name;
        balance = initialDeposit;
    }
    void deposit(double amount){
        balance = balance + amount;
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
        }
    }
    double getBalance(){
        return balance;
    }
    String getName(){
        return name;
    }
}
public class Test {
    public static void main(String[] args){
        BankAccount gatesAccount;
        gatesAccount = new BankAccount("Bill Gates", 500.0);
        BankAccount jobsAccount = new BankAccount("Steve Jobs", 0.0);
        gatesAccount.withdraw(150.0);
        jobsAccount.deposit(400.0);
        System.out.println(gatesAccount.getName() + " " + gatesAccount.getBalance());
        System.out.println(jobsAccount.getName() + " " + jobsAccount.getBalance());
        jobsAccount = null;
    }
}
