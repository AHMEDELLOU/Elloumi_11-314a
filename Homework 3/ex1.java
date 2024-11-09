public class ex1 {
    public static void main(String[] args) {
        double initialDistance = 100.0;
        double velocityA = 10.0;
        double velocityB = 15.0; 
        double accelerationA = 2.0;
        double accelerationB = 1.5;

        double time = calculateMeetingTime(initialDistance, velocityA, velocityB, accelerationA, accelerationB);
        System.out.println("Time until the bodies meet: " + time + " seconds");
    }

    public static double calculateMeetingTime(double distance, double vA, double vB, double aA, double aB) {
        double totalVelocity = vA + vB;
        double totalAcceleration = aA + aB;

        double discriminant = Math.pow(totalVelocity, 2) + 2 * totalAcceleration * distance;
        if (discriminant < 0) {
            return -1;
        }

        double time1 = (-totalVelocity + Math.sqrt(discriminant)) / totalAcceleration;
        double time2 = (-totalVelocity - Math.sqrt(discriminant)) / totalAcceleration;

        return Math.max(time1, time2);
    }
}
