import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int number, average, score;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = input.nextInt();
        average = 0;
        score = 0;
        for(int i = 0; i <= number; i++) {
            if(i %3 == 0 && i %4 == 0) {
                average += i;
                score++;
            }
        }
        System.out.println("Average: " + average / score);
    }
}
