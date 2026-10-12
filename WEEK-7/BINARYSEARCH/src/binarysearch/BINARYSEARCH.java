package binarysearch;

public class BINARYSEARCH {

   public static int binarysearch(int arr[], int t){
          int low =0;
          int high=0;
          while(low<=high){
              int mid=(low+high)/2;
              if(arr[mid]==t)
                  return mid;
              else if(arr[mid]<t)
                  low=mid+1;
              else
                  high=mid-1;
              
          }
          return-1;
      }
 public static void main(String[] args) { 
      int arr[]={10,32,42,52,85};
      int t=52;
      System.out.println("search number:"+t);
      int result= binarysearch(arr,t);
      if(result==-1)
          System.out.println("found");
      else
          System.out.println("not found"+result);
              
         
    }
    
}
