import java.util.*;

public class basics{
  public static void main(String[] args){
    // Scanner in = new Scanner(System.in);

    // int n = in.nextInt();

    // int[] arr = new int[n];

    // for(int i=0; i<n; i++){
    //   arr[i] = in.nextInt();
    // }

    int[] arr2 = {2,5,1,3,0};

    int[] arr3 = {8,10,5,7,9};
 
    smallestNum(arr2);
  }

  public static int smallestNum(int[] arr){
    int min = arr[0];

    for(int i =0; i<arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
      }
    }
    System.out.println(min);
    return min;

    
  }
}