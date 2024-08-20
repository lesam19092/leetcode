import java.util.Stack;

public class ReverseWordsinaStringIII {
    //https://leetcode.com/problems/reverse-words-in-a-string-iii/description/


    public static String reverseWords(String s) {


        StringBuilder result = new StringBuilder();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                end=i;
            } else {
                StringBuilder str = new StringBuilder(s.substring(start,end+1)).reverse().append(' ');
                result.append(str);
                start = i+1;
            }
        }
        StringBuilder str = new StringBuilder(s.substring(start,end+1)).reverse().append(' ');
        result.append(str);


        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
