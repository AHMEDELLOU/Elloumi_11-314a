public class ex8 {

    public static double calculateMean(double[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] sampleArray = {10.5, 20.0, 30.5, 40.0};
        double mean = calculateMean(sampleArray);
        System.out.println("The arithmetic mean is: " + mean);
    }
}
