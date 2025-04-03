public class C2_OccurrenceFindBinary {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 30, 40, 50, 50};
        int target = 20;        
        System.out.println(occurrenceFindBinary(arr, target));
    }

    static int occurrenceFindBinary(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;      
                // end = mid - 1;     
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
}



// public class C2_FirstOccurrence {
//     public static void main(String[] args) {
//         int[] arr = {5, 10, 10, 20, 30, 30, 30, 40, 50};
//         int target = 30;
//         System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence(arr, target));
//     }

//     static int firstOccurrence(int[] arr, int target) {
//         int start = 0, end = arr.length - 1;
//         int result = -1;

//         while (start <= end) {
//             int mid = (start + end) / 2;

//             if (arr[mid] == target) {
//                 result = mid;          
//                 end = mid - 1;        
//             } else if (target > arr[mid]) {
//                 start = mid + 1;  
//             } else {
//                 end = mid - 1;
//             }
//         }

//         return result;
//     }
// }
