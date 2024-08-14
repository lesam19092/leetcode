public class ConsecutiveCharacters {

    //https://leetcode.com/problems/consecutive-characters/description/
    public static int maxPower(String s) {

        int maxlen = 1;

        int curLen = 1;


        for (int i = 0; i < s.length(); i++) {

            System.out.println(curLen + " " + s.charAt(i) + " " + i);

            if (s.charAt(i - 1) == s.charAt(i)) {
                curLen++;
            } else {
                if (curLen > maxlen) {
                    maxlen = curLen;
                }

                curLen = 1;
            }
        }

        if (curLen > maxlen) {
            maxlen = curLen;
        }
        return maxlen;
    }

    public static void main(String[] args) {


        System.out.println(maxPower("ccbccbb"));
    }
}
