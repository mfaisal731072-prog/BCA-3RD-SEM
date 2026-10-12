
package reverse;
public class Reverse {

 public static void main(String[] args) { 
     String str="computer";
     String rev=" ";
     int x=str.length()-1;
     for(int i=x;i>=0;i--){
         rev=rev+str.charAt(i);
     }
     System.out.println("reverse String: "+rev);
    }
    
}
