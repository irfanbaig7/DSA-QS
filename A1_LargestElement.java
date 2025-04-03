public class A1_LargestElement {

    public static void main(String[] args) {
        int[] arr = { 10, 45, 78, 32, 5 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max was : " + max);
    }
}

// 🔹 Time Complexity: O(n)
// 🔹 Space Complexity: O(1)