// Perfect Number Program in Java
// Using while loop

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
         int num, sum = 0;

         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number : ");
         num = input.nextInt();

         int i = 1;
         while (i <= num / 2) {
             if (num %i == 0) {
                 sum += i;
             }
             i++;
         }
         if (sum == num) {
            System.out.println(num + " is a perfect number.");
         } else {
            System.out.println(num + " is not a perfect number.");
         }
    }
}
