import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number, digitNumber, tempNumber, digitValue, result, digitPow;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        
        number = input.nextInt();
        digitNumber = 0;
        tempNumber = number;
        result = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            digitNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            digitPow = 1;
            for (int i = 1; i <= digitNumber; i++) {
                digitPow *= digitValue;
            }
            result += digitPow;
            tempNumber /= 10;
        }
        if (result == number) {
            System.out.println(number + " number is an Armstrong Number.");
        } else {
            System.out.println(number + " number isn't an Armstrong Number.");
        }
    }
}
