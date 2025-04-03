
public class D3_NumberSwapInBubble {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2 };
        int totolswap = numSwapInBubble(arr);
        System.out.println(totolswap);
    }

    static int numSwapInBubble(int[] arr) {
        int swapCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCounter++;
                }
            }
        }
        return swapCounter;
    }
}
