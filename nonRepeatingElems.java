import java.util.*;
import java.util.Map.Entry;

// import javax.swing.RowFilter.Entry;

public class nonRepeatingElems {
  public static void main(String[] args){
    // Scanner in = new Scanner(System.in);

    // int n = in.nextInt();

    // int[] arr = new int[n];

    // for(int i =0 ;i<n; i++){
    //   arr[i] = in.nextInt();
    // }

    int[] arr = {1,2,-1,1,3,1};

    int n = arr.length;

    nonRepeatingElems(arr,n);


  }

  //brut

  // public static void nonRepeatingElems(int[] arr, int n){

  //   boolean chk;
  //   for(int i=0; i<n; i++){
  //     chk = false;
  //     for(int j=0; j<n; j++){
  //       if(i!=j && arr[i] == arr[j]){
  //         chk = true;
  //         break;
  //       }
  //     }

  //     if(!chk) System.out.print(arr[i]+" ");

  //   }

    
  // }

  // public static void nonRepeatingElems(int[] arr, int n){
  //   Arrays.sort(arr);

  //   if(arr[0] != arr[1]) System.out.print(arr[0]+" ");


  //   for(int i=1; i<n-1; i++){
  //     if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
  //       System.out.print(arr[i]+" ");
  //     }
  //   }



  //   if(arr[n-1] != arr[n-2]) System.out.print(arr[n-1]+" ");
  // }

  public static void nonRepeatingElems(int[] arr, int n){
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0; i<n; i++){
      
      if(map.containsKey(arr[i])){
        map.put(arr[i], map.get(arr[i])+1);

      }else{
        map.put(arr[i], 1);
      }
      
      
    }

    for(Entry<Integer,Integer> entry: map.entrySet()){
      if(entry.getValue() == 1){
        System.out.print(entry.getKey()+" ");

      }
    }
  }
  
}
