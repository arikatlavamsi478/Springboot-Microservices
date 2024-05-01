package StringProblems;

public class HelloWorld {

    public static void main(String[] args) {

        int x = 5;
        int y = x++; // x = 6
        int z = ++x; // x = 7

      //  x = 7, y = 5 , z = 7

        System.out.println(x);

        System.out.println(y);

        System.out.println(z);

        System.out.println(x+y+z);
    }
}
