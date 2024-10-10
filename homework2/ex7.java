public class FactorialCalculator {
     public static long factorial(int n) {
        if (n == 0) {
            return 1; 
        }
        return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        int number = 5; 
        long result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
