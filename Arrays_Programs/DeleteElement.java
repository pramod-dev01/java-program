import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        deleteElement(arr, 2);

    }
    public static void deleteElement(int arr[], int indx){
        int ans[]=new int[arr.length-1];

        for (int i = 0,j=0; i < arr.length; i++) {
            if (i!=indx) {
                ans[j]=arr[i];
                j++;
            } 
        }
        System.out.println(Arrays.toString(ans));
    }
}
