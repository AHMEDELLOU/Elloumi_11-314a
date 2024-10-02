public class Ex6 {
    public static boolean isPointInCircle(int x0, int y0, int R, double x, double y) {
        double distanceSquared = Math.pow(x - x0, 2) + Math.pow(y - y0, 2);
        return distanceSquared <= Math.pow(R, 2);
    }

    public static void main(String[] args) {
        int centerX = 0, centerY = 0, radius = 5;
        double pointX = 3, pointY = 4;

        boolean result = isPointInCircle(centerX, centerY, radius, pointX, pointY);
        System.out.println("Is the point inside the circle? " + result);
    }
}
