/**
 * findMaxElement
 */
public class findMaxElement {

    public static void main(String[] args) {
        int arr[] = {1, 12, 3, 4, 5};

        //findMaxVal(arr);
        //findSecMaxVal(arr);
        findKthMaxVal(arr, 3);
    }
    public static void findMaxVal(int arr[]){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    public static void findSecMaxVal(int arr[]){
        int max=arr[0];
        int secMax=max;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }else if(arr[i]>secMax && arr[i]!=max){
                secMax=arr[i];
            }
        }
        System.out.println(secMax);
    }
    public static void findKthMaxVal(int arr[], int k) {

    int max = Integer.MAX_VALUE;

    for (int count = 1; count <= k; count++) {

        int newMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < max && arr[i] > newMax) {
                newMax = arr[i];
            }
        }

        max = newMax;
    }

    System.out.println(k + "th largest: " + max);
}
}