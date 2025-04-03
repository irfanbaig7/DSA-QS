import java.util.Arrays;

public class D4_AccedingORdecending {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 1, 7, 8, 4, 3 };
        System.out.println("Defult array : " + Arrays.toString(arr));

        accedingBubble(arr);
        System.out.println("Accending Order : " + Arrays.toString(arr));
        decendingBubble(arr);
        System.out.println("Decending order : " + Arrays.toString(arr));

    }

    static void accedingBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }
    }
    static void decendingBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {  // < this can opretor make changes
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }
    }

}
