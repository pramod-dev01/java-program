package String_Programs;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "prpamord";
        // nonRepeatingChar(str);
        nthNonRepeatingChar(str, 1);
    }

    public static void nonRepeatingChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

    public static void nthNonRepeatingChar(String str, int n) {

        int uniquCount = 0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                uniquCount++;
                if (uniquCount == n) {
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }
}
