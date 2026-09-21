
package fruitcon;

public class FRUITCON {

   String color;
String taste;
double price;
  FRUITCON( String c, String t, double p){
     color= c;
     taste=t;
     price=p;
 }
   void Display(){
    System.out.println("Color: " +color);
    System.out.println("Taste: "+taste);
    System.out.println("Price: " +price);
     System.out.println("---------------");
 }
   
    public static void main(String[] args) {
        FRUITCON f1= new FRUITCON ("Red","Sweet",100);
         FRUITCON  f2=new FRUITCON ("Green", "Better", 70);
         FRUITCON  f3=new FRUITCON ("White", "salt", 40);
         
          f1.Display();
         f2.Display();
         f3.Display();
    }
    
}
