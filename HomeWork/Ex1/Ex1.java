import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user to input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the sum
        double sum = num1 + num2;

        // Print the result
        System.out.println("The sum of the two numbers is: " + sum);
    }
}