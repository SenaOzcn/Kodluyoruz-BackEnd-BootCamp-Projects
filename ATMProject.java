// ATM Project Java
// Importing  input output classes
import java.util.Scanner;

//create ATMProject class to implement the ATM functionality
public class ATMProject {
    //main method starts
    public static void main(String[] args) {
         // Declaring and initializing variables
         String userName, password;
         int right = 3, balance = 1500, choice, withdraw, deposit;

        //create scanner class object to get choice of user
        Scanner input = new Scanner(System.in);

        while(right > 0) {
            System.out.print("Enter User Name: ");
            userName = input.nextLine();

            System.out.print("Enter Password: ");
            password = input.nextLine();

            if (userName.equals("Kodluyoruz") && password.equals("back-end")) {
                System.out.println("Login successful, welcome to the Kodluyoruz bank!");
                
                do {
                    System.out.println("Automated Teller Machine");
                    System.out.println("Choose 1 for Withdraw");
                    System.out.println("Choose 2 for Deposit");  
                    System.out.println("Choose 3 for Check Balance");  
                    System.out.println("Choose 4 for EXIT");  
                    System.out.print("Choose the operation you want to perform: "); 

                    //get choice from user
                    choice = input.nextInt();

                    switch(choice) {
                        case 1:
                            System.out.print("Enter money to be withdraw: ");

                            //get the withdraw money from user
                            withdraw = input.nextInt();

                            //check whether the balance is greater than or equal to the withdrawal amount 
                            if (balance > withdraw) {
                                //remove the withdrawl amount from the total balance
                                balance -= withdraw;
                                System.out.println("Please collect your money.");
                            } else {
                                //show custom error message
                                System.out.println("Insufficient Balance!");
                            }
                            System.out.println("");
                            break;
                        case 2:
                            System.out.print("Enter money to be deposited: ");

                            //get deposite amount from te user
                            deposit = input.nextInt();

                            //add the deposit amount to the total balanace
                            balance += deposit;
                            System.out.println("Your Money has been successfully depsited.");
                            System.out.println("");
                            break;
                        case 3:
                            //displaying the total balance of the user
                            System.out.println("Balance: " + balance);
                            System.out.println("");
                            break;
                    } 
                } while (choice != 4);
                System.out.println("We hope see you!");
                break;
            } else {
                right --;
                System.out.println("Wrong username or password. Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your right: " + right);
                }
            }
        }
    }
}
