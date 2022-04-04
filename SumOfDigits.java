import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int number, digitNumber, result;

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number: ");
        number = input.nextInt();
        result = 0;

        while (number != 0) {
            digitNumber = number % 10;
            result += digitNumber;
            number /= 10;
        }
        System.out.println("Result: " + result);
    }
}
