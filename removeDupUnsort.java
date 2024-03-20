import java.util.*;

public class removeDupUnsort {
  public static void main(String[] args){
    int[] arr ={2,3,1,9,3,1,3,9};

    int n = arr.length;

    unSortDup(arr,n);
  }

  public static void unSortDup(int[] arr, int n){
    boolean[] mark = new boolean[n];

    for(int i=0; i<n; i++){
      mark[i] = true;
    }

    for(int i=0; i<n; i++){
      if(mark[i] == true){
        for(int j=i+1; j<n; j++){
          if(arr[i] == arr[j]){
            mark[j] = false;
  
          }
        }

      }
      
    }

    for(int i=0; i<n; i++){
      if(mark[i] == true){
        System.out.print(arr[i]+" ");
      }
    }



  }
}
