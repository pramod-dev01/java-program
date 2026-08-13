package String_Programs;

public class FindLargestWord {
    public static void main(String[] args) {
        String str = "Java programming is easy";
        largestWord(str);
    }

    public static void largestWord(String str) {
        String words[] = str.split(" ");

        String largest="";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()>largest.length()) {
                largest=words[i];
            }
        }
        System.out.println("Largest word: " + largest);
    }
}
