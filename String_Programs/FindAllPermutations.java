package String_Programs;

public class FindAllPermutations {
    public static void main(String[] args) {
        String str = "Pramod";
        char[] ch = str.toCharArray();
        permute(ch, 0);
    }

    public static void permute(char[] ch, int indx) {

        if (indx == ch.length) {
            System.out.println(new String(ch));
            return;
        }

        for (int i = indx; i < ch.length; i++) {

            swap(ch, indx, i);

            permute(ch, indx + 1);

            swap(ch, indx, i);
        }
    }

    public static void swap(char[] ch, int indx, int i) {

        char temp = ch[i];
        ch[i] = ch[indx];
        ch[indx] = temp;
    }
}
