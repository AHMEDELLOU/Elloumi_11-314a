public class ex5  {

    public static boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int x = 121;
        if (isPalindrome(x)) {
            System.out.println(x + " symmetric.");
        } else {
            System.out.println(x + " not symmetric.");
        }
    }
}
