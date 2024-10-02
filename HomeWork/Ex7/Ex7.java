public class Ex7 {
    public static void main(String[] args) {
        int decimalNumber = 29; 
        String binaryString = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary representation: " + binaryString);
        
        String[] sequences = binaryString.split("0");
        int longestSequence = 0;
        
        for (String sequence : sequences) {
            longestSequence = Math.max(longestSequence, sequence.length());
        }
        
        System.out.println("Longest sequence of '1's: " + longestSequence);
    }
}
