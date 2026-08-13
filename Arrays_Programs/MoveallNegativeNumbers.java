import java.util.Arrays;

public class MoveallNegativeNumbers {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 2, 0, -4, 0, 3 };
        moveNegativeNumbers(arr);

    }

    public static void moveNegativeNumbers(int arr[]) {

        int indx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[indx];
                arr[indx] = temp;
                indx++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
