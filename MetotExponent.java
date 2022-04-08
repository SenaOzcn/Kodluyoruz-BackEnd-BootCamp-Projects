import java.util.Scanner;

public class MetotExponent {
  static int exponent(int a, int b) {
    int result = 1;
    if (a == 0) {
      return 1;
    }
    for (int i = 1; i <= b; i++) {
      result *= a;
    }
    return result;
  }
  
  public static void main(String[] Args) {
      int a, b;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number: ");
    a = s.nextInt();
    if (a == 0) {
      System.out.println("Please enter a number except zero...");
    } else {
      System.out.print("Number => ");
      b = s.nextInt();
      System.out.println(exponent(a, b));
    }
  }
}
