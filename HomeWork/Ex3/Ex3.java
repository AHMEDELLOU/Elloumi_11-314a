public class Ex3 {
    public static void main(String[] args) {
        double x = 1.0; 
        double y = 1.0; 
        int n = 4;      

        boolean isInside = Math.abs(x) <= n / 2.0 && Math.abs(y) <= n / 2.0;

        if (isInside) {
            System.out.println("The point (" + x + ", " + y + ") is inside the square.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the square.");
        }
    }
}
