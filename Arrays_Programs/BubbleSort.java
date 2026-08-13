import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={1,4,4,32,44,5,7,0,8,32,3,3};
        sortArray(arr);
    }
    public static void sortArray(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
