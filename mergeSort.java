import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter size and integers of arr1");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = in.nextInt();
        }
        
        System.out.println("Enter size and integers of arr2");
        int m = in.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = in.nextInt();
        }
        
        int i= arr1.length-1;
        int j= 0;

        while(i>=0 && j<=arr2.length-1){
            if(arr1[i] > arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            }else{
                i--;
                j++;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
    }
    
    
}