import java.util.Scanner;

public class RecursivePrimeNumbers {
  static int i = 2;
  static boolean isPrime(int num) {
    if (num == 0 || num == 1) {
      return false;
    }
    if (num == i) {
      return true;
    }
    if (num % i == 0) {
      return false;
    }
    i++;
    return isPrime(num);
  }
  
  public static void main(String[] Args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number => ");
    int num = s.nextInt();
    System.out.println(isPrime(num));
  }
}
