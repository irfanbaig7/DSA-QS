import java.util.Arrays;

public class F2_SortInAcceding {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 0};
        accendindInsertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void accendindInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
