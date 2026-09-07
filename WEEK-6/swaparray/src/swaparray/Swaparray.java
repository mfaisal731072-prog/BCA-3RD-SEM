package swaparray;
import java.util.Scanner;
public class Swaparray {

 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
      int a[]=new int[5];
      System.out.println("enter the 5 element");
      for(int i=0;i<5;i++){
          a[i]=sc.nextInt();
      }
      System.out.println("ARRAY IS ");
      for(int i=0;i<5;i++){
          System.out.println(a[i]);
      }
      int t=a[0];
      a[0]=a[4];
      a[4]=t;
      System.out.println("arter swapping array is");
          for(int i=0;i<5;i++){
              System.out.println(a[i]);
          }
      
    }
    
}
