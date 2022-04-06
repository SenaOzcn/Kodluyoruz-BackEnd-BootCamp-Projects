// Prime Number Program in Java

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
         int i,n, m, f = 0;
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         n = input.nextInt();
         m = n / 2;
         
         if (n == 0 || n == 1) {
             System.out.println(n + " is not prime number");
         } else {
             for (i = 2; i < m; i++) {
                 if (n % i == 0) {
                     System.out.println(n + " is not prime number");
                     f = 1;
                     break;
                 }
             }
             if (f == 0) {
                 System.out.println(n + " is prime number");
             }
         }
    }
}
