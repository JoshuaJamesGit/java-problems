import java.util.*;

public class addingElemsInArray {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    int[] arr = new int[n];

    for(int i=0; i<n; i++){
      arr[i] = in.nextInt();
    }

    int numInBeg = 6;
    // insertBeginning(arr,n,numInBeg);

    int numInEnd = 7;
    // insertEnd(arr,n,numInEnd);

    int numInPos = 8;
    int pos = 4;
    inserPos(arr, n, numInPos, pos);
  }

  public static int[] insertBeginning(int[] arr, int n,int numInBeg){
    for(int i=n-2; i>=0; i--){
      arr[i+1] = arr[i];
    }

    arr[0] = numInBeg;

    System.out.println(Arrays.toString(arr));

    return arr;
    


  }

  public static int[] insertEnd(int[] arr, int n, int numInEnd){
    arr[n-1] = numInEnd;

    System.out.println(Arrays.toString(arr));
    return arr;


  }

  public static int[] inserPos(int[] arr, int n, int numInPos, int pos){
    for(int i=n-1; i>=pos; i--){
      arr[i] = arr[i-1];

    }

    arr[pos-1] = numInPos;

    System.out.println(Arrays.toString(arr));

    return arr;


  }


}
