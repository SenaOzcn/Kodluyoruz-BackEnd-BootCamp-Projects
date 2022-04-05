// Java Program to Find Min and Max values

// Importing  input output classes
import java.util.Scanner;

public class MinMax {
    //main method starts
    public static void main(String[] args) {
         // Declaring and initializing variables
         int maxNumber = 0;
         int minNumber = 0;
         Scanner input = new Scanner(System.in);

        System.out.print("How Many Numbers You Will Enter: ");
        int totalNumber = input.nextInt();

        for (int i = 1; i <= totalNumber; i++) {
            System.out.print("Enter Number " + i + ":");
            int number = input.nextInt();
            if (number > maxNumber) {
                maxNumber = number;
            } else if (number < minNumber) {
                minNumber = number;
            }
            if (minNumber==0){
                minNumber = number;
            }
        }
        System.out.println("Max Number: " + maxNumber);
        System.out.println("Min Number: " + minNumber);
    }
}
