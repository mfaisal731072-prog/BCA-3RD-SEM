package account;

public class Account {
    
    int id;
    String account_holder_name;
    String address;

    
    Account(int id, String account_holder_name, String address) {
        this.id = id;
        this.account_holder_name = account_holder_name;
        this.address = address;
    }

   
    void deposit(double amount) {
        System.out.println("Deposited Amount: " + amount);
    }

   
    void withdraw(double amount) {
        System.out.println("Withdrawn Amount: " + amount);
    }

    
    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    static double calculateCompoundInterest(double principal, double rate, double time) {
        double amount=principal*Math.pow((1+rate/100), time);
        return amount-principal ;
    }



    public static void main(String[] args) {

        
        Account acc = new Account(101, "Rahul", "Delhi");

       
        acc.deposit(50000);
        acc.withdraw(10000);

       
        double principal = 50000;
        double rate = 5;
        double time = 2;

        
        double simpleInterest =
                Account.calculateSimpleInterest(principal, rate, time);

        double compoundInterest =
                Account.calculateCompoundInterest(principal, rate, time);

       
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
