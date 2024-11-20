import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        Integer[] uniqueArray = set.toArray(new Integer[0]);
        Arrays.sort(uniqueArray);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}
