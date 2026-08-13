package String_Programs;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str = "Pramodr";
        firstRepeating(str);
    }

    public static void firstRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("First repeating character: " + str.charAt(i));
                    return;

                }
            }
        }
        System.out.println("No repeating character");
    }
}
