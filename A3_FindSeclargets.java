public class A3_FindSeclargets {

    public static void main(String[] args) {

        int[] arr = { 10, 200, 3, 0, 788, 652, 415, 354, 248 };
        // int max = arr[0];
        int largets = Integer.MIN_VALUE;
        int seclargets = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largets) {
               seclargets = largets;
               largets = arr[i];
            }

        }
        System.out.println(seclargets);
    }
}