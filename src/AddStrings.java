public class AddStrings {
    public static String addStrings(String num1, String num2) {
        //https://leetcode.com/problems/add-strings/

        StringBuilder result = new StringBuilder();
        int a = 0;
        int b = 0;
        int res = 0;
        int i = num2.length() - 1;
        int j = num1.length() - 1;
        int c = 0;
        while (i >= 0 || j >= 0) {
            if (j >= 0) {
                a = num1.charAt(j) - '0';
            } else a = 0;
            if (i >= 0) {
                b = num2.charAt(i) - '0';
            } else b = 0;
            res = (a + b + c) % 10;
            c = (a + b + c) / 10;
            result.append(res);
            i--;
            j--;
        }
        if (c > 0) {
            result.append(c);
        }
        return result.reverse().toString();

    }

    public static void main(String[] args) {

    }
}
