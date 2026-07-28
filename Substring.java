package ARRAY.inputoutput;

public class Substring {

    public int countGoodSubString(String s) {

        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {

            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);

            if (a != b && b != c && a != c) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "xyzzaz";

        Substring obj = new Substring();

        int result = obj.countGoodSubString(s);

        System.out.println("Good Substrings = " + result);
    }
}