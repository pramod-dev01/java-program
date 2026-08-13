import java.util.*;
public class rightRotateArray {
    public static void main(String[] args) {
         int arr[]={5,1,2,3,4};
        for (int i = 0; i < 1; i++) {
            rightRotate(arr);
        }
    }
    public static void rightRotate(int arr[]) {
        int last=arr[arr.length-1];
        for (int i = arr.length-1; i >0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        System.out.println(Arrays.toString(arr));
    }
}
