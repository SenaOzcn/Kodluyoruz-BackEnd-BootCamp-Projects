import java.util.Scanner;

public class PalindromicNumber {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp %10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Number => ");
        System.out.println(isPalindrom(s.nextInt()));
    }
}
