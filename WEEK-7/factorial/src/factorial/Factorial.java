
package factorial;

import java.util.Scanner;


public class Factorial {
 public static long factorial(long n){
     if(n==0||n==1){
         return 1;
     }
     return n*factorial(n-1);
 }
    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
        System.out.println("enter a number ");
        long n=sc.nextInt();
        System.out.println("factorial +" +factorial(n));
    }
    
}
