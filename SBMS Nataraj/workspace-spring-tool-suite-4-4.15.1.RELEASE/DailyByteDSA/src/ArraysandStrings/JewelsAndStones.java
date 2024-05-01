package ArraysandStrings;

import java.util.HashSet;

public class JewelsAndStones {

    public static int method(String str1, String str2) {
        HashSet<Character> set1 = new HashSet<Character>();
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        int i = 0;
        for (char c : str2.toCharArray()) {
            if (set1.contains(c)) {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(method("abc", "ac"));
    }



}
