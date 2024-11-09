public class ex2 {
    public static void main(String[] args) {
        double x = 5;
        double y = 3;
        double z = 8;

        double max = Math.max(Math.max(x, y), z);
        double min = Math.min(Math.min(x, y), z);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}