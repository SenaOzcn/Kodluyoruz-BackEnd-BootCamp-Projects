import java.util.Arrays;

public class DublicateNumbers {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 20, 5, 20};

        System.out.println("Array : " + Arrays.toString(list));
        System.out.println("Dublicate of numbers");
        int[] dublicate = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            int a = 0;
            for (int j = 0; j < list.length; j++) {
                if (j != i && list[i] == list[j]) {
                    a++;
                }
            }
            Arrays.sort(list);
            if (a > 0 && list[i] != list[i + 1]) {
                System.out.println("Number " + list[i] + " for " + (a+ 1) + " times.");
            }
        }
    }
}
