public class FirstNonRepeating {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 4, 5 };
        nonRepeatingElement(arr, 5);
    }

    public static void firstnonRepeatingElement(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("First non-repeating element: " + arr[i]);
                break;
            }

        }
        System.out.println("first non-repeating element does not exist.");
    }

    public static void nonRepeatingElement(int arr[], int nthElement) {

        int nonRepeatingCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                nonRepeatingCount++;
                if (nonRepeatingCount == nthElement) {
                    System.out.println(+nthElement + "non-repeating element: " + arr[i]);
                    return;
                }

            }

        }
        System.out.println(nthElement + " non-repeating element does not exist.");
    }
}
