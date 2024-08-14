import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {


    //https://leetcode.com/problems/two-sum/
    public static int[] twoSum(int[] nums, int target) {


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];

            if (map.containsKey(number) && map.get(number)!=i ) {
                return new int[]{i, map.get(number)};
            }
        }

        return null;
    }

    public static void main(String[] args) {

    }
}
