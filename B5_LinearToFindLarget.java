public class B5_LinearToFindLarget {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 555, 4, 7, 9, 12, 1, 999 };
        int result = linearSearchFindLargest(arr);
        System.out.println(result);
    }
    static int linearSearchFindLargest(int[] arr){
        int largetsElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largetsElem) {
                largetsElem = arr[i];
            }
        }
        return largetsElem;
    }
}
