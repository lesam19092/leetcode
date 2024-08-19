public class StringCompression {


    //https://leetcode.com/problems/string-compression/
    public static int compress(char[] chars) {

        int curlen = 1;
        char character = chars[0];
        StringBuilder str = new StringBuilder();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                curlen++;
                character = chars[i - 1];
            } else {
                str = str.append(character);
                if (curlen != 1) {
                    str = str.append(Integer.toString(curlen));
                }
                curlen = 1;
                character = chars[i];
            }

        }
        if (curlen != 1) {
            str = str.append(character + Integer.toString(curlen));
        } else {
            str = str.append(character);
        }


        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return str.length();

    }

    public static void main(String[] args) {
        char[] chars1 = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] chars2 = new char[]{'a'};
        char[] chars3 = new char[]{'a', 'b', 'c'};

        System.out.println(compress(chars3));


    }
}
