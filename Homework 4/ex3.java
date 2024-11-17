import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        int numberOfDigits = (int) Math.log10(n) + 1;
        System.out.println("Number of digits in n: " + numberOfDigits);

        scanner.close();
    }
}
