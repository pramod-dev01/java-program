package String_Programs;

public class CountEachCharFrequncy {
    public static void main(String[] args) {
        String str = "Pramodamod";
        // countChar(str);
        countEachChar(str);
    }

    public static void countChar(String strr) {

        char[] str = strr.toCharArray();

        for (int i = 0; i < str.length; i++) {

            int count = 1;

            if (str[i] != '-') {

                for (int j = i + 1; j < str.length; j++) {

                    if (str[i] == str[j]) {
                        count++;
                        str[j] = '-';
                    }
                }
                // System.out.println(str[i] + " " + count);

                // Print only Duplicates char
                if (count > 1) {
                    System.out.println(str[i] + " " + count);
                }
            }
        }

    }

    // Another Logic
    public static void countEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            boolean isDuplicates = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isDuplicates = true;
                }
            }
            if (!isDuplicates) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
            }
            System.out.println(str.charAt(i) + " " + count);

            // Print only Duplicates
            // if (count>1) {
            // System.out.println(str.charAt(i) + " " + count);
            // }
        }
    }
}
