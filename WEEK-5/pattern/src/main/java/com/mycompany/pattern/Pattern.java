
package com.mycompany.pattern;

public class Pattern {

    public static void main(String[] args) {
        int i,j,k,a=5;
        for(i=1;i<=5;i++){
            for(j=0;j<9;j++){
                if(j>=a)
                {
                    for(k=1;k<=i;k++){
                            System.out.print(k);
                            System.out.print(" ");
                }
                break;
                 }
             else {
                    System.out.print(" ");
                }
        }
        a--; 
        System.out.println();
    }
}
}