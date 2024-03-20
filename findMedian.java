import java.util.*;

public class findMedian {
  public static void main(String args[]){
    int[] arr = {2,4,1,3,5};

    int n = arr.length;

    median(arr, n);
  }

  public static void median(int[] arr, int n){
    Arrays.sort(arr);

    if(n%2 == 0){
      int integer1 = (n/2) -1;
      int integer2 = (n/2);

      System.out.println((double)(arr[integer1]+arr[integer2])/2);
    }else{
      System.out.println(arr[n/2]);
    }


  }
  
}
