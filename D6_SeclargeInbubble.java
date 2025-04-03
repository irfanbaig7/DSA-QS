
public class D6_SeclargeInbubble {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 3, 8, 7, 9 };
        System.out.println(findSeclargInbubble(arr));

    }

    static int findSeclargInbubble(int[] arr) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr[arr.length - 2];
    }
}
