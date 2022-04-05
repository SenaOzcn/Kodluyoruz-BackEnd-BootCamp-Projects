// Java program to print diamond star pattern
// Using for loop
 
// Importing  input output classes
import java.util.Scanner;

public class PrintDiamond {
    public static void main(String[] args) {
        // Declaring and initializing variables
        int num;

        // Variable initialized to the row where max star
        // should be there as after that they decreases to
        // give diamond pattern
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of digits: ");
        num = input.nextInt();


        // Outer loop 1
        // prints the first half diamond
        for (int i = 1; i <= num; i++) {

            // Inner loop 1 print whitespaces inbetween
            for (int k= 1; k <= (num - i); k++) {
                System.out.print(" ");
            }

             // Inner loop 2 prints star
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }

         // Outer loop 2
        // Prints the second half diamond
        for (int i = num - 1; i > 0; i--) {

            // Inner loop 1 print whitespaces inbetween
            for (int k = 1; k <= num - i; k++) {
                System.out.print(" ");
            }

            // Inner loop 2 print star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }
    }
}
