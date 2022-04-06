// Inverted triangle in Java using loops.

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int n = input.nextInt();

         for (int i = 0; i <= n; i++) {
             for (int j = 0; j <= n - i; j++) {
                 System.out.print(" ");
             }
             for (int k = 1; k <= 2 * i + 1; k++) {
                 System.out.print("*");
             }
             System.out.println(" ");
         }
    }
}
