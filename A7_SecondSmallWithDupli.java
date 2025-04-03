public class A7_SecondSmallWithDupli {
    public static void main(String[] args) {
        int[] arr = { 15, 7, 22, 3, 10, 7, 3 , 4 , 4};
        System.out.println(secsmallestNum(arr));
    }
    static int secsmallestNum(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secSmallest && arr[i] != smallest) {
                secSmallest = arr[i];
            }
           
        }
        return secSmallest;
    }
}
