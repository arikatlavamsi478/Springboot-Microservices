import java.util.HashSet;
import java.util.LinkedHashSet;

public class ass2 {
    public static void main(String[] args) {

        String str = "ddeerr";
        char[] ch =str.toCharArray();


        HashSet<Character> s = new LinkedHashSet<>();
        // HashSet doesn't allow repetition of elements
        for (char x : ch)
            s.add(x);

        // Print content of the set
        for (char x : s)
            System.out.print(x);
    }

}

