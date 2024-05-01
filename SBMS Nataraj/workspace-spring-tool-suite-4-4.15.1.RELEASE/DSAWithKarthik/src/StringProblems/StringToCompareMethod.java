package StringProblems;

public class StringToCompareMethod {

    public static void main(String[] args) {

        String str1 = "vamsi";
        String str2 = "vamsiarikatla";

        String str3 = "krish";

        int out = str1.compareTo(str2);

        int output = str2.compareTo(str1);

        int output1 = str1.compareTo(str3);

      //  System.out.println(out);

     //   System.out.println(output);

        System.out.println(output1);


    }
}
