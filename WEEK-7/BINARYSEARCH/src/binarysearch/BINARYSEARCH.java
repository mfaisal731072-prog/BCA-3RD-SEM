package binarysearch;
import java.util.Scanner;
public class BINARYSEARCH {

    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int []a=new int[5];
        System.out.println("enter the 5 number:");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the numbers");
        int s=sc.nextInt();
        boolean is = false;
        int l=0;
        int u=a.length-l;
        int m;
        while(l<=u){
        m=(l+u)/2;
        if(a[m]==s){
            System.out.println("found");
            is= true;
            break;
        }
        else if(a[m]>s){
            u=m-l;
        }
        else{
            l=m+1;
        }
    }
        if(is==false){
            System.out.println("not found");
        }
    }
    
}
