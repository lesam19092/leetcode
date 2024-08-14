import java.util.HashSet;
import java.util.Set;

public class JewelsandStones {

   //https://leetcode.com/problems/jewels-and-stones
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) count++;
        }

        return count;

    }

    public static void main(String[] args) {

    }
}
