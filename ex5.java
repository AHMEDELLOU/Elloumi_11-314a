import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        long square = (long) n * n;
        String squareStr = Long.toString(square);

        if (squareStr.contains("3")) {
            System.out.println("The digit 3 is present in n^2.");
        } else {
            System.out.println("The digit 3 is not present in n^2.");
        }

        scanner.close();
    }
}
