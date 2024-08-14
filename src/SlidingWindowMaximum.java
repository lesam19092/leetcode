import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class SlidingWindowMaximum {
    //TODO
    public static int[] maxSlidingWindow(int[] nums, int k) {

        Stack<Integer> stack = new Stack<>();


        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                stack.push(nums[i]);
                System.out.println(stack);
            } else {
                list.add(getMaxFromStack(stack));
                stack.remove(0);
                stack.push(nums[i]);
            }

        }
        System.out.println(stack);
        list.add(getMaxFromStack(stack));


        return list.stream().mapToInt(i -> i).toArray();
    }


    public static Integer getMaxFromStack(Stack<Integer> stack) {
        int max = -1111111;

        for (Integer obj : stack) {
            max = Math.max(max, obj);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};

        maxSlidingWindow(nums, 3);
    }
}