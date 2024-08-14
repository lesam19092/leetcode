import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqChar {

    public static int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer number = entry.getValue();
            if (number == 1) return s.indexOf(key);
        }
        return -1;
    }


    //https://leetcode.com/problems/first-unique-character-in-a-string/
    public static void main(String[] args) {

        System.out.println(firstUniqChar("leetcode"));


    }
}
