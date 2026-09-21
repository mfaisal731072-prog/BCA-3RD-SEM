
package fruitc;
public class FRUITC {
String color;
String taste;
double price;

FRUITC() {
        this("Unknown", "Unknown", 0);
    }
FRUITC(String c) {
        this(c, "Unknown");
    }
FRUITC(String c, String t) {
        this(c, t, 0);
    }
FRUITC(String c, String t, double p) {
        color = c;
        taste = t;
        price = p;
    }
     void Display(){
    System.out.println("Color: " +color);
    System.out.println("Taste: "+taste);
    System.out.println("Price: " +price);
     System.out.println("---------------");
 }
    public static void main(String[] args) {
        
         
        FRUITC f1 = new FRUITC();

         
        FRUITC f2 = new FRUITC("Red");
  
        FRUITC f3 = new FRUITC("Yellow", "Sweet");
FRUITC f4 = new FRUITC("Green", "Sour", 60);

        f1.Display();
        f2.Display();
        f3.Display();
        f4.Display();
    }
    
}
