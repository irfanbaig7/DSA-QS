public class A6_ThirdLargets {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 7, 20, 50, 32 };
        int largets = Integer.MIN_VALUE;
        int seclargets = Integer.MIN_VALUE;
        int thirdlargets = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largets) {                                                       
               thirdlargets = seclargets;
               seclargets = largets;
               largets = arr[i];
            } else if (arr[i] > seclargets && arr[i] != largets) {
                seclargets = arr[i];
            } else if (arr[i] > thirdlargets && arr[i] != seclargets) {
                thirdlargets = arr[i];
            }

        }
        System.out.println(thirdlargets); 
    }
}

