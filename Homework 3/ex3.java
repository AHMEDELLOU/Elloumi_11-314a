
public class ex3 {

    public static boolean isTriangle(double x, double y, double z) {
        return (x + y > z) && (x + z > y) && (y + z > x);
    }

    public static boolean isAcuteAngledTriangle(double x, double y, double z) {
        double a = Math.max(x, Math.max(y, z));
        double b = x + y + z - a;
        double c = x + y + z - a - b;


        return (a * a < b * b + c * c);
    }

    public static void main(String[] args) {
        double x = 3, y = 4, z = 5;

        if (isTriangle(x, y, z)) {
            System.out.println("A triangle can be formed.");
            if (isAcuteAngledTriangle(x, y, z)) {
                System.out.println("The triangle is acute-angled.");
            } else {
                System.out.println("The triangle is not acute-angled.");
            }
        } else {
            System.out.println("A triangle cannot be formed.");
        }
    }
}

