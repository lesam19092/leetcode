
public class ValidPalindrome {

    //https://leetcode.com/problems/valid-palindrome/description/


    public static boolean isPalindrome(String s) {

        int n = s.length();
        int left = 0;
        int right = n - 1;
        if (s.length() == 1) return true;

        while (left <= right) {

            while (!Character.isLetter(Character.toLowerCase(s.charAt(left)))  && !Character.isDigit(s.charAt(left)) && left < right) {
                left++;
            }
            while (!Character.isLetter(Character.toLowerCase(s.charAt(right))) && !Character.isDigit(s.charAt(right)) && left<right) {
                right--;
            }

            char fromLeftSide = Character.toLowerCase(s.charAt(left));
            char fromRigthSide = Character.toLowerCase(s.charAt(right));
            if (!(fromLeftSide == fromRigthSide)) return false;

            left++;
            right--;
        }
        return true;

    }




    public static void main(String[] args) {
        System.out.println(isPalindrome(".,"));
    }
}
