import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your exam score: ");
        int score = scanner.nextInt();
        int grade;

        if (score < 56) {
            grade = 0; 
        } else if (score >= 56 && score < 71) {
            grade = 3; 
        } else if (score >= 71 && score < 86) {
            grade = 4; 
        } else {
            grade = 5; 
        }

        switch (grade) {
            case 0:
                System.out.println("You have failed.");
                break;
            case 3:
                System.out.println("Your grade is three.");
                break;
            case 4:
                System.out.println("Your grade is four.");
                break;
            case 5:
                System.out.println("Your grade is five.");
                break;
            default:
                System.out.println("Invalid score.");
        }

        scanner.close();
    }
}
