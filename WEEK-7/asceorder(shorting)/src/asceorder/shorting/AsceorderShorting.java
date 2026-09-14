
package asceorder.shorting;

import java.util.Scanner;
public class AsceorderShorting {

    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
        System.out.println("enter 5 numbers:");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4-i;j++){
                if(a[j]>a[j+i]){
                    int t= a[j];
                    a[j]=a[j+1];
                    a[j+1]= t;
                
            }
            }
        }
        System.out.println("array is ascending order is :");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
    
}
