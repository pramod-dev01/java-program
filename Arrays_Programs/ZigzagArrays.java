import java.util.Arrays;

public class ZigzagArrays {
    public static void main(String[] args) {
        int ar1[] = { 1, 3, 5, 7 };
        int ar2[] = { 2, 4, 6, 8, 5 };
        zigzagArraysMerge(ar1, ar2);
    }
    public static void zigzagArraysMerge(int ar1[],int ar2[]){
        int ans[]=new int[ar1.length+ar2.length];
int min=ar1.length<ar2.length?ar1.length:ar2.length;
        for(int i=0,j=0; j<ans.length;i++){
            if (i<min) {
                ans[j++]=ar1[i];
                ans[j++]=ar2[i];
                
            }else if (ar1.length>min){
                ans[j++]=ar1[i];
            }else if (ar2.length>min){
                ans[j++]=ar2[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
