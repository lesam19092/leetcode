import java.util.Arrays;

public class MoveZeroes {


    //https://leetcode.com/problems/move-zeroes/description/
    public static void moveZeroes(int[] nums) {

        int cur = 0;

        int n = nums.length;


        if (n == 1) return;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[cur] = nums[i];
                cur++;
            }
        }
        for (int i = cur; i < n; i++) {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }


    public static void main(String[] args) {

        int[] n = {0, 1, 0, 3, 12};
        moveZeroes(n);
    }
}
