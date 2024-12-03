import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine().trim();
        String line2 = scanner.nextLine().trim();
        String line3 = scanner.nextLine().trim();

        System.out.println(line1.replace(line2, line3));
    }
}
