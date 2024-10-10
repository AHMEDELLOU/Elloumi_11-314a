import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        
        System.out.println(input >= 5 ? (input - 2) : (input * input));
        
        scanner.close();
    }
}
