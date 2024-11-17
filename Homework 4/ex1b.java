import java.util.Scanner;

public class ex1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        double product = 1.0;
        for (int k = 1; k <= n; k++) {
            product *= (1 + 1.0 / (k * k));
        }
        System.out.println("Product = " + product);

        scanner.close();
    }
}
