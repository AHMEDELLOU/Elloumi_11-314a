public class Ex5 {
    public static void main(String[] args) {
        String input = " I am ahmed elloumi . are my friend . They are my friends.Me and my friends.";

        String[] sentences = input.split("\\.\\s*");

        for (String sentence : sentences) {
            sentence = sentence.trim();

            if (!sentence.isEmpty()) {
                String firstWord = sentence.split("\\s+")[0];
                if (!(firstWord.equalsIgnoreCase("Me") ||
                        firstWord.equalsIgnoreCase("I") ||
                        firstWord.equalsIgnoreCase("You") ||
                        firstWord.equalsIgnoreCase("They"))) {
                    System.out.println("Invalid sentence: " + sentence);
                }
            }
        }
    }
}
