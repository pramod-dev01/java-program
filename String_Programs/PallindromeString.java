package String_Programs;

public class PallindromeString {

    public static void main(String[] args) {
        String str = "Abcba";
        System.out.println(isPallindrome(str));
    }

    public static boolean isPallindrome(String str) {
        str=str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
