
package edible;
public class Edible {
static class Fruit{
    static void fruitDetails() {
            System.out.println("Fruit Details: Apple, Mango, Banana");
        }
    void fruitPackaging() {
            System.out.println("Fruit Packaging: Fruits are packed in boxes.");
        }
     }
static class vegetable{
     static void vegetableDetails(){
         System.out.println("vegetable Details: tomato, potato, peas");
     }
     void vegetablePackaging(){
         System.out.println("vegetable  Packaging: vegetables are packed in boxes.");
  }
} 
    public static void main(String[] args) {
        Fruit.fruitDetails();
        vegetable.vegetableDetails();

        
        Fruit f = new Fruit();
        f.fruitPackaging();

        vegetable v = new vegetable();
        v.vegetablePackaging();
    }
    
}
