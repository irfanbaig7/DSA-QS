public class B3_HOWmanyOcurrenc {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 45, 78, 30, 63, 88, 52, 30, 30 };
        int target = 30;
        System.out.println(howmanyOccurnce(arr, target));
    }

    static int howmanyOccurnce(int[] arr, int target){
        int counterOfOccur = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                counterOfOccur++;
            }
            
        }
        return counterOfOccur;
    }
}
