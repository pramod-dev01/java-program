import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int ar1[] = { 1, 3, 5, 7 };
        int ar2[] = { 2, 4, 6, 8 };
        mergeArrays(ar1, ar2);
    }

    public static void mergeArrays(int ar1[], int ar2[]) {
        int ans[] = new int[ar1.length + ar2.length];
        for (int i = 0; i < ans.length; i++) {
            if (i < ar1.length) {
                ans[i] = ar1[i];
            } else {
                ans[i] = ar2[i-ar1.length];
            }
        }
        System.out.println((Arrays.toString(ans)));
    }
}
