import java.util.Scanner;

public class PrintPattern {
  public static int pattern(int number) {
    int original = number;
    System.out.print(number + "\t");

    if (number > 0) {
      original = pattern(number -= 5);
    }
    if (number == 0 || number < 0) {
      number +=5;
      return number;
    }
    if (original > 0) {
      number += 5;
    }
    return number;
  }
  public static void main(String[] Args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the n number : ");
    int n = s.nextInt();
    System.out.print(pattern(n));
  }
}
