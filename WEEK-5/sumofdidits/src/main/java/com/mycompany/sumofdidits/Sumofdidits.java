
package com.mycompany.sumofdidits;
import java.util.Scanner;

public class Sumofdidits {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("enter the integer positive/negative=");
         n=sc.nextInt();
         n=Math.abs(n);
         while(n>0){
             sum= sum+ n%10;
             n=n/10;
         }
         System.out.println("sum of digits="+sum);
         sc.close();
         
    }
}
