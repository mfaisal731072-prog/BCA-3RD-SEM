

package com.mycompany.sumofseries;

import java.util.Scanner;
public class Sumofseries {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        double sum=0;
        int i;
        for(i=1;i<=n;i++){
            sum=sum=(1.0/i);
        }
        System.out.println("sum is "+sum);
    }
}
