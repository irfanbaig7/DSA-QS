public class C5_FindIndexOf1 {

    public static void main(String[] args) {
        
        int[] arr = {0, 0, 0, 0, 0, 1, 1, 2, 3, 4, 5, 6};
        System.out.println(findIndexOfOne(arr));

    }
    static int findIndexOfOne(int[] arr){
        int target = 1;
        int start = 0;
        int result = -1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = mid;
                end = mid - 1;
            }else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        return result;
    }
}


