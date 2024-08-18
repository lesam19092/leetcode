import java.util.*;

public class SlidingWindowMaximum {
    //TODO
    public static int[] maxSlidingWindow(int[] nums, int k) {

        int b = k;

        List<Integer> list = new ArrayList<>();
        int max = -1111111;
        for (int i = 0; i < nums.length - k + 1; i++) {
            for (int j = i; j < b; j++) {
                max = Math.max(max, nums[j]);
                System.out.print(j + " ");
            }
            b++;
            System.out.println();
            list.add(max);
            max = -11111;

        }
        return list.stream().mapToInt(i -> i).toArray();
    }


    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};

        maxSlidingWindow(nums, 3);
    }
}