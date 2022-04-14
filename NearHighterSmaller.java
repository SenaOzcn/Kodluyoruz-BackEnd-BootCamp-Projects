import java.util.Scanner;
import java.util.Arrays;

public class NearHighterSmaller {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = input.nextInt();

        list[0] = n;
        Arrays.sort(list);
        int near = Arrays.binarySearch(list, n);
        System.out.println("array : " + Arrays.toString(list));
        System.out.println("entered number : " + n);
        System.out.println("smallest number greater than the entered number : " + list[near+1]);
        System.out.println("largest number smaller than the entered number : " + list[near-1]);
    }
}
