import java.util.Arrays;

public class MissingNumber {

    //https://leetcode.com/problems/missing-number/

    public static int missingNumber(int[] nums) {


        int len = nums.length;
        return  ((len+1) * len / 2 ) -Arrays.stream(nums).sum();
    }

    public static void main(String[] args) {

        int[] nums = {3,0,1};

        System.out.println(missingNumber(nums));
    }
}
