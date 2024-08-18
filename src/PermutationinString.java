import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PermutationinString {

    //https://leetcode.com/problems/permutation-in-string/description/


    public static boolean checkInclusion(String s1, String s2) {
        int len = s1.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (!map1.containsKey(s1.charAt(i))) {
                map1.put(s1.charAt(i), 1);
            } else {
                map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>();

//TODO
        for (int i = 0; i < len; i++) {
            if (!map2.containsKey(s2.charAt(i))) {
                map2.put(s2.charAt(i), 1);
            } else {
                map2.put(s2.charAt(i), map2.get(s2.charAt(i)) + 1);
            }
        }
        map2.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("----------");

        for (int i = len; i < s2.length(); i++) {
            if (map2.equals(map1)) return true;

            if (map2.containsKey(s2.charAt(i - len + 1))) {

                if (map2.get(s2.charAt(i - len + 1)) == 1) {
                    map2.remove(s2.charAt(i - len + 1));
                } else {
                    map2.put(s2.charAt(i - len + 1), map2.get(s2.charAt(i - len + 1)) - 1);
                }
            }

            if (!map2.containsKey(s2.charAt(i))) {
                map2.put(s2.charAt(i), 1);
            } else {
                map2.put(s2.charAt(i), map2.get(s2.charAt(i)) + 1);
            }


            map2.forEach((key, value) -> System.out.println(key + " " + value));
            System.out.println("----------");
        }

        if (map2.equals(map1)) return true;

        return false;

    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
}
