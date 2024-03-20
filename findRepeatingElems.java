import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class findRepeatingElems {
  public static void main(String[] args){
    int[] arr = {1,1,2,3,4,4,5,2};

    int n = arr.length;

    findRepeatingElems(arr,n);
  }

  //brut force
  // public static int[] findRepeatingElems(int[] arr, int n){
  //   int count = 0;

  //   int[] dup = new int[n];

  //   for(int i=0; i<n-1; i++){
  //     for(int j=i+1; j<n; j++){
  //       if(arr[i] == arr[j]){
  //         dup[count++] = arr[i];
  //       }
  //     }
  //   }

  //   // System.out.println(Arrays.toString(dup));
  //   for(int i=0; i<n; i++){
  //     if(dup[i] >0){
  //       System.out.print(dup[i]+" ");
  //     }
  //   }
  //   return dup;
  // }




  //sorting
  // public static void findRepeatingElems(int[] arr, int n){
  //   Arrays.sort(arr);

  //   for(int i=0; i<n-1; i++){
  //     if(arr[i] == arr[i+1]){

  //       System.out.print(arr[i]+" ");
  //     }
  //   }
  // }


  //HashMap
  public static void findRepeatingElems(int[] arr, int n){
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0; i<n; i++){
      if(map.containsKey(arr[i])){
        map.put(arr[i], map.get(arr[i])+1);
      }else{
        map.put(arr[i], 1);
      }
    }

    for(Entry<Integer,Integer> entry: map.entrySet()){
      if(entry.getValue() > 1){
        System.out.prin(map.getKey()+" ");
      }
    }
  }
}


