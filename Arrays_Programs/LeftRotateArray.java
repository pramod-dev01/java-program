import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int arr[]={5,1,2,3,4};
        for (int i = 0; i < 1; i++) {
            leftRotate(arr);
        }
    }
    public static void leftRotate(int arr[]){
        int first=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        System.out.println(Arrays.toString(arr));
    }
}
