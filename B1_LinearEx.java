public class B1_LinearEx {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 30, 50 };
        int target = 30;

        int index = findTheElem(arr, target);
        if (index != -1) {
            System.out.println("Found : " + index);
        } else {
            System.out.println("idx Not found");
        }
    }

    static int findTheElem(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}