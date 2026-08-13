package String_Programs;

//Input str1 = "abcd"
//      str2 = "cdab"
//Output: String is rotation
public class CheckStringRotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab1";
        checkRotation(str1, str2);
    }

    public static void checkRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Not rotation");
            return;
        }
        String temp = str1 + str2;
        if (temp.contains(str2)) {
            System.out.println("rotation String");
        } else {
            System.out.println("Not rotation");
        }
    }
}
