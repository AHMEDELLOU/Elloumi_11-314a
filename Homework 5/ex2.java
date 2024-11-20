import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        int sum = 0;

        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        double mean = (double) sum / N;
        System.out.println("Arithmetic Mean: " + mean);
    }
}
