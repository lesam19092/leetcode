import java.util.*;

public class IsomorphicStrings {


    //https://leetcode.com/problems/isomorphic-strings/description/

    //TODO
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!map1.containsKey(c)) {
                map1.put(c, 1);
            } else {
                map1.put(c, map1.get(c) + 1);
            }
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (!map2.containsKey(c)) {
                map2.put(c, 1);
            } else {
                map2.put(c, map2.get(c) + 1);
            }
        }
        List<Integer> list1 = new ArrayList<>(map1.values().stream().toList());
        List<Integer> list2 = new ArrayList<>(map2.values().stream().toList());


        list1.stream().forEach(System.out::println);
        Collections.sort(list1);
        list1.stream().forEach(System.out::println);


        System.out.println("--------");

        list2.stream().forEach(System.out::println);
        Collections.sort(list2);
        list2.stream().forEach(System.out::println);


        return list2.equals(list1);
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }
}
