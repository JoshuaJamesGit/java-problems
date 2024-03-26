import java.util.Arrays;
import java.util.HashMap;

public class rankElements {
  public static void main(String[] args){
    int[] arr = {20,15,26,2,98,6};
    int n = arr.length;

    int[] brr = new int[n];

    for(int i=0; i<n; i++){
      brr[i] = arr[i];
    }

    Arrays.sort(brr);

    HashMap<Integer,Integer> map = new HashMap<>();

    int temp = 1;

    for(int i=0; i<n; i++){
      if(map.get(brr[i]) == null){
        map.put(brr[i], temp);
        temp++;
      }
      
    }

    for(int i=0; i<n; i++){
      System.out.print(map.get(arr[i])+" ");
    }


  }
}
