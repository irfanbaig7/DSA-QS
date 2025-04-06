public class F1_InsertionSort {
    public static void main(String[] args) {

    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Current element to be placed correctly
            int j = i - 1;

            // Shift elements to the right to make space for key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert key at the right position
        }
    }
}
