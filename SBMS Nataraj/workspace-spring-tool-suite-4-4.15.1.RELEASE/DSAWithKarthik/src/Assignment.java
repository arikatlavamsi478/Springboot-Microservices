import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment {

    public static void main(String[] args) {


        String s = "saravanan";
        char[] ch = s.toCharArray();
        HashSet<Character> hset = new LinkedHashSet<>();


        for (char data:ch) {
           // System.out.println(data);
            hset.add(data);

        }
      //  System.out.print(hset);

        for (char data1: hset) {
          //  System.out.print(data1);
            System.out.print(data1);

        }
        //System.out.println(hset);
    }
}
