package objectoriented;
public class ObjectOriented {

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

class JavaLanguage extends ObjectOriented {

    void persistence() {
        System.out.println("Persistence");
    }

    void interfaces() {
        System.out.println("Interfaces");
    }
    
    public static void main(String[] args) {
      JavaLanguage obj = new JavaLanguage();

        obj.abstraction();
        obj.polymorphism();
        obj.inheritance();

        obj.persistence();
        obj.interfaces();  
    }
     
}

