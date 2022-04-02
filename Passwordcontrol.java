import java.util.Scanner;

public class Passwordcontrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while(!passwordSuccessfull) {
            System.out.println("Please enter your password: ");
            String typedPassword = input.next();

            if(customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Successfully logged into the system!");
            }
        }
    }
}
