import java.util.Arrays;

public class SquaresofaSortedArray {

    //https://leetcode.com/problems/squares-of-a-sorted-array

    /*
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]


    Input: nums = [-7,-3,2,3,11]
    Output: [4,9,9,49,121]
     */


    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int rigth = nums.length - 1;
        int index = nums.length - 1;
        int[] result = new int[nums.length];
        while (left <= rigth) {
            if (nums[left] * nums[left] < nums[rigth] * nums[rigth]) {
                result[index] = nums[rigth] * nums[rigth];
                index--;
                rigth--;
            } else {
                result[index] = nums[left] * nums[left];
                index--;
                left++;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};


        System.out.println(sortedSquares(nums));


    }
}
