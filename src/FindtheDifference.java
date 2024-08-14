import java.util.Arrays;

public class FindtheDifference {

    //https://leetcode.com/problems/find-the-difference/description/
    public char findTheDifference(String s, String t) {

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        char[] charss = t.toCharArray();
        Arrays.sort(charss);

        for (int i = 0; i < s.length(); i++) {
            if (chars[i] != charss[i]) return charss[i];
        }
        return charss[t.length() - 1];
    }


    public static void main(String[] args) {

    }

}
