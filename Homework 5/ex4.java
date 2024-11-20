import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int N = scanner.nextInt();
        Integer[] array = new Integer[N];

        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sorted array in reverse order: " + Arrays.toString(array));
    }
}
