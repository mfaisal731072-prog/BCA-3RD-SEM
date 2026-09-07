package linersearch;

import java.util.Scanner;


public class Linersearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a[]=new int[5];
      System.out.println("enter the 5 element");
      for(int i=0;i<5;i++){
          a[i]=sc.nextInt();
      }
        System.out.println("array is");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        System.out.println("enter number to be search");
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<5;i++){
        if(a[i]==x){
            System.out.println("found");
            count++;
            break;
        }
    }
        if(count==0)
            System.out.println("not found");
            
        }
    
}
