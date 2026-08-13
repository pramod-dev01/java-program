package String_Programs;

public class Panagram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        if (isPanagram(str)) {
            System.out.println("The given string is a Pangram.");
        } else {
            System.out.println("The given string is not a Pangram.");
        }
    }

    public static boolean isPanagram(String str) {

        str = str.toUpperCase();
        int count = 0;

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                    break;
                }
            }
        }
        if (count == 26) {
            return true;
        } else {
            return false;
        }
    }
}
