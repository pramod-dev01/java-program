package String_Programs;

public class SubStrings {
    public static void main(String[] args) {
        String str = "Pramod";
        subStrings(str);
    }

    public static void subStrings(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {
                String subString = "";
                for (int k = i; k <= j; k++) {
                    subString += str.charAt(k);
                }
                System.out.println(subString);

            }
        }
    }
}
