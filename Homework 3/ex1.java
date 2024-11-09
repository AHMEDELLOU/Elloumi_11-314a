public class ex1 {
    public static void main(String[] args) {
        double initialDistance = 100;
        double velocity1 = 10;
        double velocity2 = 10;
        double acceleration1 = 2;
        double acceleration2 = 2;

        double time = calculateMeetingTime(initialDistance, velocity1, velocity2, acceleration1, acceleration2);
        System.out.println("Time to meet: " + time + " seconds");
    }

    public static double calculateMeetingTime(double distance, double v1, double v2, double a1, double a2) {
        double totalVelocity = v1 + v2;
        double totalAcceleration = a1 + a2;
        return (-totalVelocity + Math.sqrt(totalVelocity * totalVelocity + 2 * totalAcceleration * distance)) / totalAcceleration;
    }
}