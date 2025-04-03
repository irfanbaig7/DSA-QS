import java.util.Arrays;

public class D5_withoutThirdVariSwap {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        withoutThirdVaribaleSwap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void withoutThirdVaribaleSwap(int[] arr){
        boolean isSwapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }
}
