package HashSet;

import java.util.HashMap;

import static java.lang.System.exit;

public class ValidAnargam {

    public static void isAnargam(String str1, String str2){

        // if lengths not equals return false
        if(str1.length() != str2.length()){
            System.out.println("false");
            // exit if this condition not meet. controller will not go next lines
           exit(0);
        }

        // create hashmap for store characters and number of characters
        HashMap<Character, Integer> Hmap = new HashMap<Character, Integer>();

        // convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // for each for store key-value pair in hashmap

        for (char c: str1.toCharArray()) {
            Hmap.put(c, Hmap.getOrDefault(c,0)+1 );

        }
        // for each to check if characters already exists in hashmap
        for (char c: str2.toCharArray()) {

            // if any of character not exists it return false
            if(!Hmap.containsKey(c)){
                System.out.println("false");
                // controller exists here.
                exit(0);
            }
        }
        System.out.println("true");


    }

    public static void main(String[] args) {
        isAnargam("vamsi", "nsicz");

    }



}
