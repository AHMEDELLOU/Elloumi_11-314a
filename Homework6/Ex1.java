public class Ex1 {
    public static void main(String[] args) {
        String input = "ahmed elloumi student of kfu ";
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
