

package com.mycompany.inputnumber;

import java.util.Scanner;


public class Inputnumber {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      
        System.out.println("enter a number:");
        int n= sc.nextInt();
        for (int i=1; i<=10;i++) {
            System.out.println(n+"x"+i+"="+(n*i));   
        }
    }
}
