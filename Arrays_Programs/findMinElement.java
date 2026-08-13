/**
 * findMinElement
 */
public class findMinElement {
        public static void main(String[] args) {
        int arr[]={1,12,3,4,5};

        findMINVal(arr);
        findSecMINVal(arr);
    }
    public static void findMINVal(int arr[]){
         int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    public static void findSecMINVal(int arr[]){
         int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                secMin=min;
                min=arr[i];
            }else if(arr[i]<secMin && arr[i]!=min){
                secMin=arr[i];
            }
        }
        System.out.println(secMin);
    }
}