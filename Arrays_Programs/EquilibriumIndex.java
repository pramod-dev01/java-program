// EquilibriumIndex =Sum of elements on the left side = Sum of elements on the right side.
public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 2 };
        findEquilibriumIndex(arr);
    }
    public static void findEquilibriumIndex(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total - arr[i];

            if (total == leftSum) {
                System.out.println("Equilibrium index: " + i);
                return;
            }
            leftSum = leftSum + arr[i];
        }
        System.out.println("No equilibrium index found.");
    }

}
