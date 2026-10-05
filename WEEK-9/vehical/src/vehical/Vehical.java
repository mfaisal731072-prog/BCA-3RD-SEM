package vehical;

  class Vehicle {
    void cost() {
        System.out.println("Cost of the vehicle is calculated.");
    }
}

class Bus extends Vehicle {
    void display() {
        System.out.println("This is a Bus.");
    }
}

class Train extends Vehicle {
    void display() {
        System.out.println("This is a Train.");
    }
}

public class Vehical {
    public static void main(String[] args) {

        
      
        Bus bus = new Bus();
        Train train = new Train();

        
        bus.cost();
        bus.display();

        train.cost();
        train.display();
    }
}

    