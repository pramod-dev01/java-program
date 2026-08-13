import java.util.Arrays;

/**
 * DeleteMultipleElements
 */
public class DeleteMultipleElements {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6,6,4,2,4,5,6};
        deleteMultipleElements(arr, 4);
    }
    public static void deleteMultipleElements(int arr[], int val){
        int newLength=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=val) {
                newLength++;
            }
        }

        int ans[]=new int[newLength];
        for (int i = 0,j=0; i < arr.length; i++) {
            if (arr[i]!=val) {
                ans[j++]=arr[i];
        
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}