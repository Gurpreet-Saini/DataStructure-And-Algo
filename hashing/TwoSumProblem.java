package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] number = {2, 6, 5, 8, 11};
        int target = 16;
        System.out.println(Arrays.toString(twoSum(number, target)));
    }

    private static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                result[0] = map.get(target - arr[i]);  // map.get(6) is returning 1 because we put the number as key and index as value in map
                result[1] = i;
                return result;
            }
            map.put(arr[i], i);
        }// end of for
        return result;
    }//end of method
}
