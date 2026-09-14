
package palindrome;
import java.util.Scanner;
public class Palindrome {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the number");
        
        
        String s=sc.nextLine();
        String rev="";
        int len=s.length();
        for(int i=0;i<len;i++){
            rev=s.charAt(i)+rev;
        }
        if(s.equals(rev))
            System.out.println("palindrome");
        else 
            System.out.println("not palindrome");
    }
    
}
