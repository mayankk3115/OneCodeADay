import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static void main(String[] args) {

        int [] num = new int[]{-8, -6, 1, 2, 3, 5};
        List<Integer[]> list = threeNumberSum(num, 0);
        for (Integer[] arr : list) {
            System.out.print(Arrays.stream(arr).toList() + " ");
        }
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        for (int current=0; current<array.length-1; current++) {
            int left = current+1;
            int right = array.length-1;
            while(left < right) {
                int currentSum = (array[current]+array[left]+array[right]);

                if (currentSum == targetSum){
                    result.add(new Integer[] {array[current], array[left], array[right]});
                    left++;
                    right--;
                }else if (currentSum < targetSum){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return result;
    }
}
