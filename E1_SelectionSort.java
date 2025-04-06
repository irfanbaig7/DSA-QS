import java.util.Arrays;

public class E1_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        sortArraySelection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArraySelection(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minidx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }
            }
            if (minidx != i) {
                int temp = arr[i];
                arr[i] = arr[minidx];
                arr[minidx] = temp;
            }
        }
    }
}
