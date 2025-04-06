import java.util.Arrays;

public class G1_CycleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1, 2};
        cycleSortImpliment(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycleSortImpliment(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }
}