import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArraysII {


    //https://leetcode.com/problems/intersection-of-two-arrays-ii/
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!map1.containsKey(nums1[i])) {
                map1.put(nums1[i], 1);
            } else {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!map2.containsKey(nums2[i])) {
                map2.put(nums2[i], 1);
            } else {
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {


            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (map2.containsKey(key)) {

                int min = Math.min(value, map2.get(key));
                for (int i = 0; i < min; i++) {
                    list.add(key);
                }

            }
        }


        return list.stream().mapToInt(i -> i).toArray();

    }

    public static void main(String[] args) {

        int[] n1 = {1, 2, 2, 1};
        int[] n2 = {2, 2};


        System.out.println(intersect(n1, n2));
    }
}
