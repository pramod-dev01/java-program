package String_Programs;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "koli";
        String s2 = "koli";
        if (isAnagrams(s1, s2)) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("String is Not Anagram");
        }
    }

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length()!=s2.length()) {
            return false;
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagras(String s1, String s2) {

    if (s1.length() != s2.length()) {
        return false;
    }

    for (int i = 0; i < s1.length(); i++) {

        int count1 = 0;
        int count2 = 0;

        for (int j = 0; j < s1.length(); j++) {

            if (s1.charAt(i) == s1.charAt(j)) {
                count1++;
            }

            if (s1.charAt(i) == s2.charAt(j)) {
                count2++;
            }
        }

        if (count1 != count2) {
            return false;
        }
    }

    return true;
}
public static boolean isAnagrams(String s1, String s2) {

    if (s1.length() != s2.length()) {
        return false;
    }

    for (int i = 0; i < s1.length(); i++) {

        int count = 0;

        for (int j = 0; j < s1.length(); j++) {
            if (s1.charAt(i) == s1.charAt(j))
                count++;
            System.out.println(count);

            if (s1.charAt(i) == s2.charAt(j))
                count--;
            System.out.println(count);
        }

        if (count != 0)
            return false;
    }

    return true;
}
}
