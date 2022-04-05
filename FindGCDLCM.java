// Java Program to Find GCD and LCM

// Importing  input output classes
import java.util.Scanner;

public class FindGCDLCM {
    //main method starts
    public static void main(String[] args) {
         // Declaring and initializing variables
         int a, b, gcd, lcm;

         Scanner input = new Scanner(System.in);

         System.out.print("Please enter the 'a' number: ");
         a = input.nextInt();

         System.out.print("Please enter the 'b' number: ");
         b = input.nextInt();
         gcd = 1;
         lcm = 1;

        int i = 1;
        while(i <= a) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println("GDC = " + gcd);
         
        while (lcm <= (a * b)) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM = " + lcm);
                break;
            }
            lcm++;
        }
    }
}
