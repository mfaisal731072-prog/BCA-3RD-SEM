
package objectorientationclass;

public class Objectorientationclass {

    
    void abstraction() {
        System.out.println("Abstraction");
    }

    void polymorphism() {
        System.out.println("Polymorphism");
    }

    void inheritance() {
        System.out.println("Inheritance");
    }
}

class JavaLanguage extends Objectorientationclass {

    void persistence() {
        System.out.println("Persistence");
    }

    void interfaces() {
        System.out.println("Interfaces");
    }
}

class Cpp extends Objectorientationclass {

    void template() {
        System.out.println("Template");
    }

    void friendFunction() {
        System.out.println("Friend Function");
    }

    public static void main(String[] args) {
       Cpp obj = new Cpp();

        obj.abstraction();
        obj.polymorphism();
        obj.inheritance();

        obj.template();
        obj.friendFunction();
    }
    
}

