
package multipleinheretanc;


       
interface Bike {

    void offer();

    default void details() {
        System.out.println("This is Bike Details");
    }
}

interface Scooty {

    void offer();

    default void details() {
        System.out.println("This is Scooty Details");
    }
}

class BuySomething implements Bike, Scooty {

    public void offer() {
        System.out.println("Special Offer Available");
    }

    @Override
    public void details() {

        Bike.super.details();

        Scooty.super.details();
    }
}

public class MULTIPLEINHERETANC {
    public static void main(String[] args) {

        BuySomething b = new BuySomething();

        b.offer();
        b.details();
    }
}

