import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a command: ");
        String input = scanner.nextLine();

        if ("hello".equalsIgnoreCase(input)) {
            System.out.println("world");
        } else {
            System.out.println("I don't know the command");
        }

        scanner.close();
    }
}
