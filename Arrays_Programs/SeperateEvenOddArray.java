import java.util.Arrays;

/**
 * SeperateEvenOddArray
 */
public class SeperateEvenOddArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 67, 8, 9, 0, 10 };
        seperateEvenOddArrays(arr);
    }

    public static void seperateEvenOddArrays(int arr[]) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int evenArray[] = new int[evenCount];
        int oddArray[] = new int[oddCount];

        for (int i = 0, j = 0, k = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[j++] = arr[i];
            } else {
                oddArray[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));

    }
}