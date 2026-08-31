
package com.mycompany.sumofallarray;

import java.util.Scanner;


public class Sumofallarray {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        double sum=0;
        int i;
        for(i=1;i<=n;i++){
        sum=sum+(1.0/i);
        
    }
        System.out.println("sum is"+sum);
    }
}
