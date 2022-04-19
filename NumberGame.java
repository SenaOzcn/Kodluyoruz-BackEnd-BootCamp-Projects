import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
 
class NumberGame {
   public static void main(String args[]) {
     Random random = new Random();
     int number = random.nextInt(100);

     Scanner scanner = new Scanner(System.in);

     int right = 0;
     int selected;
     int[] wrong = new int[5];
     boolean isWin = false;
     boolean isWrong = false;


     while (right < 5) {
        System.out.print("Enter the number : ");
        selected = scanner.nextInt();

        if (selected < 0 || selected > 100) {
         System.out.println("Invalid number...");
         if (isWrong) {
            right++;
            System.out.println("Please try again! Your right : " + (5 - right));
         } else {
            isWrong = true;
            System.out.println("Please try again! If you enter the wrong number it will be take your right!");
         }
         continue;
        }

        if (selected == number) {
           System.out.println("Congratulations!\n You won!");
           isWin = true;
           break;
        } else {
           System.out.println("You entered the wrong number...");
           if (selected > number) {
              System.out.println(selected + " is greater than the number.");
           } else {
              System.out.println(selected + " is smaller than the number.");
           }

           wrong[right++] = selected;
           System.out.println("Your right : " + (5 - right));
        }
     }
     if (!isWin) {
        System.out.println("You lose all your rights...");
        if (!isWrong) {
           System.out.println("You entered " + Arrays.toString(wrong) + " numbers.");
        }
     }
   }
}
