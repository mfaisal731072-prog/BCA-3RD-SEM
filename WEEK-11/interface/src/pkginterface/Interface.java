package pkginterface;

interface Account {
    void deposit();
    void withdraw();

    static void aboutBank() {
        System.out.println("Welcome to SBI Bank");
        System.out.println("Bank provides saving and current accounts");
    }    
}

class Saving implements Account {

    public void deposit() {
        System.out.println("Saving Account: 55,000/- Deposited");
    }

    public void withdraw() {
        System.out.println("Saving Account: 26,000/- Withdrawn");
    }
}

class Current implements Account {

    public void deposit() {
        System.out.println("Current Account: 1,20,525/- Deposited");
    }

    public void withdraw() {
        System.out.println("Current Account: 56,450/- Withdrawn");
    }
}

public class Interface {
    public static void main(String[] args) {

        Saving s = new Saving();
        Current c = new Current();

        Account.aboutBank();

        s.deposit();
        s.withdraw();

        c.deposit();
        c.withdraw();
    }
}


