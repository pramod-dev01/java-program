public class SubarraySum {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 20, 3, 10, 5 };
        int target = 330;
        findSubarray(arr, target);
    }

    public static void findSubarray(int arr[], int target) {

        int start = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            while (sum > target && start <= i) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {

                System.out.println("Subarray found:");

                for (int j = start; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                return;
            }
        }
        System.out.println("Subarray not found");
    }
}
