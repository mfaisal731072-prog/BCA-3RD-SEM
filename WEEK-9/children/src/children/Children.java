package children;

abstract class Account {

    int id;
    String account_holder_name;
    String address;

    Account(int id, String account_holder_name, String address) {
        this.id = id;
        this.account_holder_name = account_holder_name;
        this.address = address;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}



class Saving extends Account {

    double min_balance;

    Saving(int id, String account_holder_name, String address,
           double min_balance) {

        super(id, account_holder_name, address);
        this.min_balance = min_balance;
    }

    void display() {
        System.out.println("\n--- Saving Account ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + account_holder_name);
        System.out.println("Address: " + address);
        System.out.println("Minimum Balance: " + min_balance);
    }

    void deposit(double amount) {
        System.out.println("Saving Account Deposit: " + amount);
    }

    void withdraw(double amount) {
        System.out.println("Saving Account Withdraw: " + amount);
    }
}



class Current extends Account {

    double max_withdrawl_limit;

    Current(int id, String account_holder_name, String address,
            double max_withdrawl_limit) {

        super(id, account_holder_name, address);
        this.max_withdrawl_limit = max_withdrawl_limit;
    }

    void display() {
        System.out.println("\n--- Current Account ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + account_holder_name);
        System.out.println("Address: " + address);
        System.out.println("Maximum Withdrawal Limit: "
                           + max_withdrawl_limit);
    }

    void deposit(double amount) {
        System.out.println("Current Account Deposit: " + amount);
    }

    void withdraw(double amount) {
        System.out.println("Current Account Withdraw: " + amount);
    }
}



public class Children {

    public static void main(String[] args) {

        Saving s = new Saving(
                101,
                "Rahul",
                "Delhi",
                5000
        );

        Current c = new Current(
                102,
                "Amit",
                "Mumbai",
                50000
        );

        s.display();
        s.deposit(10000);
        s.withdraw(3000);

        c.display();
        c.deposit(20000);
        c.withdraw(15000);
    }
}
