public class CountEachElements {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 2, 4, 2, 1, 1, 3, 3 };
        countEach(arr);
    }

    public static void countEach(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1; // your -1 marker solution is actually very good. Just make sure the input
                                     // doesn't contain -1.
                        // alternate is Integer.MIN_VALUE
                    }
                }
                //System.out.println(arr[i] + " count" + count);
                
                // To print only duplicates
                // if (count>1) {
                // System.out.println(arr[i] + " count" + count);
                // }

                //find duplicats Elements
                if (count>1) {
                System.out.println(arr[i]);
                }

            }
        }
    }
}