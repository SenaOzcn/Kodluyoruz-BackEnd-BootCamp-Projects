import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        int n, k, total;
      
        Scanner input = new Scanner(System.in);
      
        System.out.print("Enter the number to get the exponent: ");
        n = input.nextInt();
      
        System.out.print("Enter the number to be the exponent: ");
        k = input.nextInt();
      
        total = 1;
      
        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("Result: " + total);
    }
}
