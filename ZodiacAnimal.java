import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create variable
      int year;
        // Get Data from User
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please Enter Your Born Year: ");
      year = input.nextInt();
        
      if (year %12 == 0) {
          System.out.println("Your Chinese Zodiac Animal is Monkey!");
      } else if (year %12 == 1) {
          System.out.println("Your Chinese Zodiac Animal is Rooster!");
      } else if (year %12 == 2) {
          System.out.println("Your Chinese Zodiac Animal is Dog!");
      } else if (year %12 == 3) {
          System.out.println("Your Chinese Zodiac Animal is Pig!");
      } else if (year %12 == 4) {
          System.out.println("Your Chinese Zodiac Animal is Rat!");
      } else if (year %12 == 5) {
          System.out.println("Your Chinese Zodiac Animal is Ox!");
      } else if (year %12 == 6) {
          System.out.println("Your Chinese Zodiac Animal is Tiger!");
      } else if (year %12 == 7) {
          System.out.println("Your Chinese Zodiac Animal is Rabbit!");
      } else if (year %12 == 8) {
          System.out.println("Your Chinese Zodiac Animal is Dragon!");
      } else if (year %12 == 9) {
          System.out.println("Your Chinese Zodiac Animal is Snake!");
      } else if (year %12 == 10) {
          System.out.println("Your Chinese Zodiac Animal is Horse!");
      } else if (year %12 == 11) {
          System.out.println("Your Chinese Zodiac Animal is Goat!");
      } else {
          System.out.println("You entered incorrect data. Please try again!");
      }
    }
}
