import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        permute(arr, 0);
    }

    public static void permute(int arr[], int indx) {
        if (indx == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = indx; i < arr.length; i++) {
            swap(arr, indx, i);
            permute(arr, indx + 1);
            swap(arr, indx, i);
        }
    }
    public static void swap(int arr[], int indx, int i) {
        int temp = arr[i];
        arr[i] = arr[indx];
        arr[indx] = temp;
    }

}
