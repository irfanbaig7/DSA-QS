public class C4_LastOccurr {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 12, 20, 20, 20, 20, 30, 40, 50, 50 };
        int target = 20;
        System.out.println(lastOccurrInBinary(arr, target));
    }

    static int lastOccurrInBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = mid;
                start = mid + 1;     // for last occurr
                // end = mid - 1;      // for frist occurr
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
