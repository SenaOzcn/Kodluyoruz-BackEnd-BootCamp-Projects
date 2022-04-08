import java.util.Scanner;

public class RecursiveFibonacci {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } 
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Number => ");
        System.out.println(fib(s.nextInt()));
    }
}
