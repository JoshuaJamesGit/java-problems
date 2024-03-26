public class primeOrNot {
  public static void main(String[] args) {
    int a = 2;
    int b = 10;

    printPrimesInRange(a,b);
  }

  public static void printPrimesInRange(int a, int b){
    for(int i=a; i<=b; i++){
      if(isPrime(i)){
        System.out.print(i+" ");
      }
    }
  }

  public static boolean isPrime(int n){
    if(n == 1) return false;

    for(int i=2; i<=Math.sqrt(n); i++){
      if(n%i == 0){
        return false;
      }
    }

    return true;
  }
}


