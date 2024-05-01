package StringProblems;

public class StringConcatenate {
    public static void main(String[] args) {
        String name1 = "Vamsi";
        String name2 = "Krishna";

        String nameSum = name1 + "" + name2;
       char[] ch = nameSum.toCharArray();
        System.out.println(nameSum);
        System.out.println(nameSum.length());

        // Access characters of string using for loop
        /*for (int i=0; i<nameSum.length();i++){
            System.out.println(nameSum.charAt(i));
        }*/
// Access characters of string using extended for  loop
        for (char ch1:ch) {
            System.out.println(ch1);

        }
    }
}
