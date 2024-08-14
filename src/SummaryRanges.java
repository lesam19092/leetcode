import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {


    public static List<String> summaryRanges(int[] nums) {

        int n = nums.length;
        int currentRange = 0;
        int leftNumber = 0;
        int rightNumber = 0;

        List<String> list = new ArrayList<>();

        if (n == 0) {
            return list;
        }
        if (n == 1) {
            list.add(Integer.toString(nums[0]));
            return list;
        }


        for (int i = 0; i < n - 1; i++) {

            if (currentRange == 0) {
                leftNumber = nums[i];
                rightNumber = nums[i];
            }
            if ((nums[i + 1] - nums[i]) == 1) {
                currentRange += 1;
                rightNumber = nums[i + 1];
            } else {
                currentRange = 0;
                if (leftNumber == rightNumber) {
                    list.add(Integer.toString(rightNumber));
                } else {
                    list.add(leftNumber + "->" + rightNumber);
                }
            }
            rightNumber = nums[i + 1];
        }
        if (currentRange != 0) {
            list.add(leftNumber + "->" + rightNumber);
        } else {
            list.add(Integer.toString(rightNumber));
        }


        return list;

    }

    // https://leetcode.com/problems/summary-ranges/
    public static void main(String[] args) {
        int[] num = {0, 2, 3, 4, 6, 8, 9};
        System.out.println(summaryRanges(num));

    }
}