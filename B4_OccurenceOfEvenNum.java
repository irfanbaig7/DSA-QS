public class B4_OccurenceOfEvenNum {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 7, 9, 12, 1 };
        System.out.println(evneNumOccurr(arr));
    }

    static int evneNumOccurr(int[] arr) {

        int evenNumOccurrCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumOccurrCounter++;
            }
        }
        return evenNumOccurrCounter;

    }
}