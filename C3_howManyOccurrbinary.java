public class C3_howManyOccurrbinary {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 20, 30, 40, 50, 50};
        int target = 20;        
        System.out.println(findfristOccurr(arr, target));
        System.out.println(findlastOccurr(arr, target));
        // System.out.println(totallOccurrCount(arr, target));
       
    }
    static int findfristOccurr(int[] arr, int target){
        int start = 0; 
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = mid;
                end = mid - 1;
            }
                    else if (arr[mid] < target) {
                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
        }
        return result;

    }
    static int findlastOccurr(int[] arr, int target){
        int start = 0; 
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = mid;
                start = mid + 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return result;

    }

    static int totallOccurrCount(int[] arr, int target){
        int frist = findfristOccurr(arr, target);
        int last = findlastOccurr(arr, target);

        if (frist == -1 || last == -1) {
            return 0;
        } else {
            return last - frist + 1;
        }
    }
}
