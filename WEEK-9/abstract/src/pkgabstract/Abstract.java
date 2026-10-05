package pkgabstract;

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


class SavingAccount extends Account {

    SavingAccount(int id, String account_holder_name, String address) {
        super(id, account_holder_name, address);
    }

    @Override
    void deposit(double amount) {
        System.out.println("Deposited Amount: " + amount);
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Withdrawn Amount: " + amount);
    }
}



public class Abstract {

    public static void main(String[] args) {

        SavingAccount acc = new SavingAccount(
                101,
                "Rahul",
                "Delhi"
        );

        System.out.println("Account ID: " + acc.id);
        System.out.println("Account Holder: " + acc.account_holder_name);
        System.out.println("Address: " + acc.address);

        acc.deposit(50000);
        acc.withdraw(10000);
    }
}
