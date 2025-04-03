
public class A4_Smallest {
    public static void main(String[] args) {
        int[] arr = { 15, 7, 22, 3, 10, 2 };
        System.out.println(smallest(arr));
    }

    static int smallest(int[] arr) {
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }
}
