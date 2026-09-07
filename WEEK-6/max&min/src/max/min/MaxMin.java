package max.min;


public class MaxMin {

   
    public static void main(String[] args) {
      
        int []arr={20,30,52,75,96};
      int max= arr[0];
      int min= arr[0];
      for(int i=1;i<arr.length;i++){
          if(arr[i]>max)
              max=arr[i];
          if(arr[i]<min)
              min=arr[i];
      }
        System.out.println("array" );
        System.out.println("max element"+max);
        System.out.println("min element"+min);
    }
    
}
