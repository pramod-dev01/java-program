package String_Programs;

public class RemoveDuplicatesChars {
    public static void main(String[] args) {
        String str = "pramodpramod";
        removeDuplicates(str);
    }

    public static void removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
