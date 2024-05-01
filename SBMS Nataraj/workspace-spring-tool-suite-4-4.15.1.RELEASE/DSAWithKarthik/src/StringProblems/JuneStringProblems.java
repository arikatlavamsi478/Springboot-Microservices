package StringProblems;

import java.util.Locale;

public class JuneStringProblems {

    public static String method() {

        String greeting = "Hello World!";
        return greeting;
    }

    public static Integer length() {

        String length = "Hello World!";
        return length.length();
    }


    public static String convertUppercase() {

        String string = "Hello World!";
       // return string.toUpperCase();
       // return string.toUpperCase(Locale.ROOT);
        return string.toUpperCase();
    }

    public static String subString() {

        String string = "Hello World!";
        //string =  string.substring(5);
        string = string.substring(0,5);
        return string;
    }


    public static void main(String[] args) {
        System.out.println(method());
        System.out.println(length());
        System.out.println(convertUppercase());
        System.out.println(subString());

    }
}

