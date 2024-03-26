import java.util.HashMap;

class Pair{
  int first;
  int second;

}

public class sortByFreq {
  public static void main(String[] args){
    int[] arr = {1,2,3,2,4,3,1,2};

    int n = 8; 

    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0; i<n; i++){
      if(map.containsKey(arr[i])){
        map.put(arr[i], map.get(arr[i])+1);
      }else{
        map.put(arr[i], 1);
      }
    }

    






  }
  
}
