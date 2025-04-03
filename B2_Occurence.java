public class B2_Occurence {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 45, 78, 30, 63, 88, 52 };
        int target = 30;
        int result = findeLastOcurre(arr, target);
        if (result != -1) {
            System.out.println("last occurence found index no : " + result);
        } else {
            System.out.println("Not Found " + result);
        }
    }

    static int findeLastOcurre(int[] arr, int target) {
        int lastOcurre = -1;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == target) {
                lastOcurre = i;
            }
            i++;
        }
        return lastOcurre;
    }
}
