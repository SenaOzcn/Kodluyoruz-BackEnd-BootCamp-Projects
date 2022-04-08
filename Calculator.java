import java.util.Scanner;

public class Calculator {
    static int sum(int a, int b) {
        return a + b;
    }
    static int minus(int a, int b) {
        return a - b;
    }
    static int times(int a, int b) {
        return a * b;
    }
    static int divided(int a, int b) {
        if (b == 0)
            return 0;
        return a / b;
    }
    static int power(int a, int b) {
        int power = 1;
        if (b == 0) {
            return 1;
        }
        if (a == 0) {
            return 0;
        }
        for (int i = 1; i <= b; i++) {
            power *= a;
        }
        return power;
    }
    static int mod(int a, int b) {
        return a % b;
    }
    static void calc(int a, int b) {
        System.out.println("P: " + 2 * (a + b));
        System.out.println("A: " + a * b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int select;
        String menu = "+\n-\n*\n/\n^\n%\n#\n0";

        do {
            System.out.println(menu);
            System.out.print("Select: ");
            select = s.nextInt();

            if (select == 0) {
                System.out.println("See you!");
                break;
            }
            System.out.print("Enter first number: ");
            int a = s.nextInt();
            System.out.print("Enter second number:");
            int b = s.nextInt();
            switch(select) {
                case '+':
                    System.out.println(sum(a, b));
                    break;
                case '-':
                    System.out.println(minus(a, b));
                    break;
                case '*':
                    System.out.println(times(a, b));
                    break;
                case '/':
                    if(divided(a, b) == 0) {
                        System.out.println("second number should be greater than zero...");
                    } else {
                        System.out.println(divided(a, b));
                    }
                    break;
                case '^':
                    if (power(a, b) == 0) {
                        System.out.println("firt number should be greater than zero...");
                    } else {
                        System.out.println(power(a, b));
                    }
                    break;
                case '%':
                    System.out.println(mod(a, b));
                    break;
                case '#':
                    calc(a, b);
                    break;
                default:
                    System.out.println("Invalid number...");
            }
        } while (select != 0);
    }
}
