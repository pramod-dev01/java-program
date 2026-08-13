
/**
 * InsertElement
 */
import java.util.*;

public class InsertElement {

    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int indx=2;
        int val=3;
        insertElement2(arr, indx, val);
    }

    public static void insertElement(int arr[], int indx, int val) {
        int ans[] = new int[arr.length + 1];
        for (int i = 0, j = 0; i < ans.length; ) {
            if (i != indx) {
                ans[i] = arr[j];
                i++;
                j++;
            } else {
                ans[i] = val;
                i++;
             
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void insertElement2(int arr[], int indx, int val) {
        int ans[] = new int[arr.length + 1];
        for(int i=0,j=0;i<ans.length;i++){
            if (i==indx) {
                ans[i]=val;
            }else{
                ans[i]=arr[j];
                j++;
            }
        }
         System.out.println(Arrays.toString(ans));
    }
}