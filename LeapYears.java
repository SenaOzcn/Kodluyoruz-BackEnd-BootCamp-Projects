import java.util.Scanner;
public class LeapYears {
    public static void main(String[] args) {
        // Create variable
      int year;
        // Get Data from User
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please Enter the Year: ");
      year = input.nextInt();

      if ((year >= 0) && (year <= 2500)) {
          if ((year %4 == 0) && (year %100 !=0)) {
              System.out.println(year + " is a leap year!");
          } else if ((year %100 == 0) && (year %400 == 0)) {
              System.out.println(year + " is a leap year!");
          } else if ((year %100 == 0) && (year %400 != 0)) {
              System.out.println(year + " is not a leap year!");
          } else {
              System.out.println(year + " is not a leap year!");
          }
      } else {
          System.out.println("You entered incorrect data. Please try again!");
      }
    }
}
