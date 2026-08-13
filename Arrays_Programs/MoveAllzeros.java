import java.util.Arrays;

public class MoveAllzeros {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 4, 0, 3 };
        moveZeros(arr);
        moveZerosFirst(arr);
    }

    public static void moveZeros(int arr[]) {

        int indx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[indx] = arr[i];
                indx++;
            }
        }
        // Fill remaining positions with 0
        while (indx < arr.length) {
            arr[indx] = 0;
            indx++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosFirst(int arr[]) {

        int index = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }

        // Fill remaining positions with 0
        while (index >= 0) {
            arr[index] = 0;
            index--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
