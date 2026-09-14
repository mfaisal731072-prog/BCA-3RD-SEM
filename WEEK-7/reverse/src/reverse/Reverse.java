
package reverse;
import java.util.Scanner;

public class Reverse {

   
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int l=s.length();
        String s1=" ";
        for(int i=l-1;i>=0;i--){
            char c=s.charAt(i);
            s1=s1+c;
        }
        System.out.println("reversed String is"+s1);
    }
    
}
