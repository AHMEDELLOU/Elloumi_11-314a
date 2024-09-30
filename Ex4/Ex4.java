import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int previousNumber = Integer.MAX_VALUE; 
        int currentNumber;

        System.out.println("Enter numbers (input will stop if a number is less than the previous one):");

        while (true) {
            currentNumber = scanner.nextInt();

            if (currentNumber < previousNumber) {
                System.out.println("Input interrupted. The last number was less than the previous one.");
                break;
            }

            previousNumber = currentNumber; 
        }

        scanner.close();
    }
}
