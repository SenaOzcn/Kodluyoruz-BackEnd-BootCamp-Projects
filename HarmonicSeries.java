import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        double number, result;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = input.nextDouble();
        result = 0;

        while (number > 0) {
            result += (1 / number);
            number--;
        }
        System.out.println("Harmonic Series: " + result);
    }
}
