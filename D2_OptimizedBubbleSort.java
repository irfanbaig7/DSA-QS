import java.util.Arrays;

public class D2_OptimizedBubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        optimizedBubbleSortCheck(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void optimizedBubbleSortCheck(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwaaped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwaaped = true;
                }
            }

            if (!isSwaaped) {
                break;
            }

        }
    }
}
