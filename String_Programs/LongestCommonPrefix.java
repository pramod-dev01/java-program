package String_Programs;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String arr[] = { "flower", "flow", "flight" };
        longestCommonPrefix(arr);
    }

    public static void longestCommonPrefix(String arr[]) {

        String prefix = "";

        for (int i = 0; i < arr[0].length(); i++) {

            char ch = arr[0].charAt(i);

            for (int j = 1; j < arr.length; j++) {

                if (i >= arr[j].length() || arr[j].charAt(i) != ch) {
                    System.out.println("Longest common prefix: " + prefix);
                    return;
                }
            }

            prefix = prefix + ch;
        }

        System.out.println("Longest common prefix: " + prefix);
    }
}
