import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a real number a: ");
        double a = scanner.nextDouble();

        double sum = 0.0;
        int k = 1;
        while (sum <= a) {
            sum += 1.0 / k;
            k++;
        }

        System.out.println("First number in the sequence greater than a: " + sum);
        scanner.close();
    }
}
