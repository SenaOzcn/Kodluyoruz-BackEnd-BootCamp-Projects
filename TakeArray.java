import java.util.Arrays;
import java.util.Scanner;


public class TakeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();

        System.out.print("Enter the number of columns : ");
        int m = sc.nextInt();

        int array[][] = new int[n][m];
        System.out.println("Enter the elements of the array : ");

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of the array are : ");   
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
