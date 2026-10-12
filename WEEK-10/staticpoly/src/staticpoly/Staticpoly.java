
package staticpoly;


public class Staticpoly {
static void minMaxAdd(int a, int b){
    System.out.println("integers:");
     System.out.println("Minimum = " + Math.min(a, b));
        System.out.println("Maximum = " + Math.max(a, b));
        System.out.println("Addition = " + (a + b));
        System.out.println();
}
    static void minMaxAdd(double a, double b){
        System.out.println("Real Numbers:");
        System.out.println("Minimum = " + Math.min(a, b));
        System.out.println("Maximum = " + Math.max(a, b));
        System.out.println("Addition = " + (a + b));
        System.out.println();
    } 
    
    public static void main(String[] args) {
       minMaxAdd(10, 20);

       
        minMaxAdd(10.5, 20.5);

      
        minMaxAdd('A', 'Z'); 
    }
    
}

