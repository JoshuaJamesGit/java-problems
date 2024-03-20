// import java.util.HashMap;
// import java.util.Scanner;
import java.util.*;

public class symmentricPairs {
  public static void main(String[] args){
    
    int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};

    int row = 5;
    int column = 2;

    symmentricPairs(arr,row,column);
  }

  

  public static void symmentricPairs(int[][] arr, int row, int column){
    

    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0; i<row; i++){
      int first = arr[i][0];
      int second = arr[i][1];

      if(map.get(second) != null && map.get(second) == first ){
        System.out.print("("+first+" "+second+")");


      }else{
        map.put(first,second);
      }
    }


  }
}
