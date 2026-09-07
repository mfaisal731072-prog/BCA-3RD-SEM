
package prime;
import java.util.Scanner;
public class Prime {

    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the element");
        int n=sc.nextInt();
        boolean isprime=false; 
        if(n<=1){
            isprime=true;
        }
        else{
             for (int i=1;i<=n/2;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
             }
        }
        if(isprime){
            System.out.println("is prme");
        }
        else{
            System.out.println("is not prime");
        }
    }
    
}
