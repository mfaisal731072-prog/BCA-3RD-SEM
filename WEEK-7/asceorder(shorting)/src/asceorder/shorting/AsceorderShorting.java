
package asceorder.shorting;

public class AsceorderShorting {

    public static void sort(int arr[]){
         int x=arr.length-1;
          for(int i=0;i<x;i++){
              for(int j=0;j<x-i;j++){
                  if(arr[j]>arr[j+1]){
                  int t=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=t;
                }
              }
           }
      }
 public static void main(String[] args) { 
      int arr[]={10,3,8,6,5,2};
      sort(arr);
      for(int e:arr)
      {
          System.out.println(e+" ");
      }
    }
    
}
