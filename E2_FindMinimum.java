public class E2_FindMinimum {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 8, 6, 2 };

        // int smallest = Integer.MAX_VALUE;
        // int secondSmallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secLargest = largest;
                largest = num;
            } else if (num > secLargest && num != largest) {
                secLargest = num;
            }
        }

        System.out.println("Second largest Element: " + secLargest);

    }

}
