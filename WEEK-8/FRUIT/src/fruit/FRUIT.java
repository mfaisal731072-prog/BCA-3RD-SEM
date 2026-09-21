
package fruit;


public class FRUIT {
String color;
String taste;
double price;
 void Display(){
    System.out.println("Color: " +color);
    System.out.println("Taste: "+taste);
    System.out.println("Price: " +price);
     System.out.println("---------------");
}
   
    public static void main(String[] args) {
       FRUIT f1=new FRUIT();
        FRUIT f2=new FRUIT();
         FRUIT f3=new FRUIT();
         
         f1.color="red";
         f1.taste="sweet";
         f1.price = 100;
         
          f2.color="green";
         f2.taste="better";
         f2.price = 80;
         
          f3.color="white";
         f3.taste="salt";
         f3.price = 50;
         
         
         f1.Display();
         f2.Display();
         f3.Display();
       
       
    }
    
}
