import java.util.Scanner;

public class ex1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        long result = (long) Math.pow(2, n);
        System.out.println("2^n = " + result);

        scanner.close();
    }
}
