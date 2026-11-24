package pkginterface.account;

interface Account {
    void deposit();
    void withdraw();

    static void aboutBank() {
        System.out.println("Welcome to AXIS Bank");
    }

    default void takeLoan() {
        System.out.println("Loan facility is available");
    }
}

class Saving implements Account {

    public void deposit() {
        System.out.println("Saving Account: Money Deposited");
    }

    public void withdraw() {
        System.out.println("Saving Account: Money Withdrawn");
    }

    @Override
    public void takeLoan() {
        System.out.println("Saving Account: Loan Taken Successfully");
    }
}

class Current implements Account {

    public void deposit() {
        System.out.println("Current Account: Money Deposited");
    }

    public void withdraw() {
        System.out.println("Current Account: Money Withdrawn");
    }
}

public class InterfaceAccount {
    public static void main(String[] args) {

        Saving s = new Saving();
        Current c = new Current();

        Account.aboutBank();

        s.deposit();
        s.withdraw();
        s.takeLoan();

        c.deposit();
        c.withdraw();
    }
}


