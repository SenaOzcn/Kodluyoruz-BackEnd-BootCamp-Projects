import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args) {
        int number;
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit number: ");
        number = scanner.nextInt();
      
        for (int i = 1; i <= number; i *= 4) {
            System.out.println("4th Power is " + i);
        }
        for (int i = 1; i <= number; i *= 5) {
            System.out.println("5th Power is  " + i);
        }
    }
}
