/**
 * MissingElement
 */
public class MissingElement {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 8 };
        // findMissingEle(arr);
        findMultipleMissingElements(arr);
    }

    public static void findMissingEle(int arr[]) {
        int n = arr.length + 1;
        int total = (n * (n + 1) / 2);
        int sum = 0;
        int missEle = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        missEle = total - sum;
        System.out.println(missEle);
    }

    // "Find multiple missing elements from 1 to N"
    public static void findMultipleMissingElements(int arr[]) {
        int n = 8;
        boolean present[] = new boolean[n + 1];

        for (int i = 0; i < arr.length; i++) {
            present[arr[i]] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}