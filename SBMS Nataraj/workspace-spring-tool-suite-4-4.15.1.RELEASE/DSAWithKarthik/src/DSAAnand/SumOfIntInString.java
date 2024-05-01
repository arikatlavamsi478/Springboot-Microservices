package DSAAnand;

public class SumOfIntInString {
    public static void main(String[] args) {

        String str = "2567";

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           // sum = sum + Character.getNumericValue(ch);
           // using ACII approach
            sum = sum + (ch - 48);

        }
        System.out.println(sum);
    }
}
