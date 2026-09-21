package fruitset;

public class FRUITSET {
String color;
String taste;
double price;
  void setDetails( String c, String t, double p){
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
        FRUITSET f1= new FRUITSET();
         FRUITSET f2=new FRUITSET();
         FRUITSET f3=new FRUITSET();
         
         f1.setDetails("Red","Sweet",100);
         f2.setDetails("Green", "Better", 70);
         f3.setDetails("White", "salt", 40);
         
          f1.Display();
         f2.Display();
         f3.Display();
    }
    
}
