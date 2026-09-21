
package fruitarg;

public class Fruitarg {
String color;
String taste;
double price;

   Fruitarg(){
    color = "Unknown";
        taste = "Unknown";
        price = 0;
       
          }
    Fruitarg(String c){
         color= c;
     taste= "Unknown";
     price=0;
    }
    Fruitarg(String c, String t) {
        color = c;
        taste = t;
        price = 0;
    }
     void Display(){
    System.out.println("Color: " +color);
    System.out.println("Taste: "+taste);
    System.out.println("Price: " +price);
     System.out.println("---------------");
 }
   
    
    public static void main(String[] args) {
         
        Fruitarg f1 = new Fruitarg();

        
        Fruitarg f2 = new Fruitarg("Red");

        
        Fruitarg f3 = new Fruitarg("Yellow", "Sweet");

        
        f1.Display();
        f2.Display();
        f3.Display();
       
    }
    
}
