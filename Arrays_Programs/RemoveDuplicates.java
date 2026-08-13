public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 2, 4, 2, 1, 1, 3, 3 };
        removeDuplicates(arr);

    }

    public static void removeDuplicates(int arr[]) {
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < uniqueCount; j++) {

                if (arr[i] == arr[j]) {
                    break;
                }
            }

            if (j == uniqueCount) {
                arr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
