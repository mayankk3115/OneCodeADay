import java.util.HashMap;

public class ZeroSumArray {

    public static void main(String[] args) {
        int[] arr = new int[]{4,-3,2,4,-1,-5,7};
        boolean result = findZeroSumSubArray(arr);
        System.out.println("Zero sum subArray exists: " + result);
    }

    public static boolean findZeroSumSubArray(int[] array) {

        int curSum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i< array.length-1;i++) {
            curSum += array[i];
            if (curSum == 0){
                return true;
            }
            if (hm.containsKey(curSum)) {
                return true;
            } else {
                hm.put(curSum, array[i]);
            }
        }
        return false;
    }
}
