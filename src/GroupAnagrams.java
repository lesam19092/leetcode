import java.util.*;

public class GroupAnagrams {

    //  https://leetcode.com/problems/group-anagrams/
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String string : strs) {

            String sortedString = sortString(string);

            if (!map.containsKey(sortedString)) {
                List<String> list = new ArrayList<>();
                list.add(string);
                map.put(sortedString, list);
            } else {
                List<String> list = map.get(sortedString);
                list.add(string);
                map.put(sortedString, list);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }

    private static String sortString(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }


    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));

    }
}


