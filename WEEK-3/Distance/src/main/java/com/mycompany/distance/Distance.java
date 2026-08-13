
package com.mycompany.distance;

import java.util.Scanner;


public class Distance {

    public static void main(String[] args) {
        Scanner sc= new
                Scanner(System.in);
        double x1=sc.nextDouble(),
                y1=sc.nextDouble();
        double x2=sc.nextDouble(),
                y2=sc.nextDouble();
        double d= Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
        System.out.println("Distsance between two points=" +d);
    }
}
