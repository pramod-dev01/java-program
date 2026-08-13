package String_Programs;

// Input :- I have good knowledge in the java language
//Output:- I evah doog egdelwonk ni eht avaj egaugnal
public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "I have good knowledge in the java language";
        reverseEachWord(str);
    }

    public static void reverseEachWord(String str) {
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = str.charAt(i) + word;
            } else {
                System.out.print(word + " ");
                word = "";
            }
        }
        System.out.print(word);
    }
}
