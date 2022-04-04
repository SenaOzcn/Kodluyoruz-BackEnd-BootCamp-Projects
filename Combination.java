import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        // C(n,r) = n! / (r! * (n - r)!)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n number: ");
        int n = scanner.nextInt();
        System.out.println("Please enter r number: "); 
        int r = scanner.nextInt();
        int total_n = 1;
        int total_r = 1;
        int dif;
        int mix = 1;
        int combination;

        for (int i = 1; i <= n; i++) {
            total_n *= i;
        }
        System.out.println( n + ". Factorial: " + total_n );

        for (int i = 1; i <= r; i++) {
            total_r *= i;
        }
        System.out.println( r + ". Factorial: " + total_r );

        dif = n - r;
        for (int i = 1; i <= dif; i++) {
            mix *= i;
        }

        combination = total_n / (total_r * (mix));
        System.out.println("The combination is " + combination);
    }
}
