public class Ex3 {
    public static void main(String[] args) {
        String line = "i'm ahmed elloumi. i'm student of kfu university. my teacher his name azat.";
        String[] sentences = line.split("\\. ");
        StringBuilder capitalizedLine = new StringBuilder();

        for (String sentence : sentences) {
            capitalizedLine.append(Character.toUpperCase(sentence.charAt(0))).append(sentence.substring(1)).append(". ");
        }

        System.out.println(capitalizedLine.toString().trim());
    }
}
