import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of last digits to sum (m): ");
        int m = scanner.nextInt();

        int modValue = (int) Math.pow(10, m);
        int lastDigits = n % modValue;
        int sum = 0;

        while (lastDigits > 0) {
            sum += lastDigits % 10;
            lastDigits /= 10;
        }

        System.out.println("Sum of the last " + m + " digits: " + sum);
        scanner.close();
    }
}
