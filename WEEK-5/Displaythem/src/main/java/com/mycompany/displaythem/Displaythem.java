
package com.mycompany.displaythem;
import java.util.Scanner;
public class Displaythem {

    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        
        int [] a=new int[5];
        System.out.println("enter the 5 number:");
        
      
         for(int i=0; i<5;i++){
            a[i]=sc.nextInt();
        }
          System.out.println("Array element are:");
           for(int i=0; i<5;i++){
            System.out.println(a[i]);
        }
    }
}
