import java.util.Arrays;

public class SegregateEvenOddVal {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, -0, 1, 0, 1, 0, -1, 0, 1, };
        segregateVal(arr);
    }

    public static void segregateVal(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] % 2 == 0) {
                start++;
            } else if (arr[end] % 2 != 0) {
                end--;
            } else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
