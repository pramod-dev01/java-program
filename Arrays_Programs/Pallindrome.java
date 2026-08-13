/**
 * Pallindrome
 */
public class Pallindrome {

    public static void main(String[] args) {
       int arr[]={1,2,3,2,1,1}; 

       if(isPallindrome(arr)){
        System.out.println("Pallindrome Arrays");
       }else{
        System.out.println("not Pallindrome");
       }
    }
    public static boolean isPallindrome(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            if(arr[start]!=arr[end]){
                return false;
            }
        start++;
        end--;
        }
     return true; 
    }
}
