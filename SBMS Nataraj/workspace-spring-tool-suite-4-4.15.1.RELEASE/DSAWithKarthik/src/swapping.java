public class swapping {

    public static void main(String[] args) {
         int a = 4;
         int b = 3;

         b = a + b;
         a = b - a;
         b = b - a;

        System.out.println(a);
        System.out.println(b);
    }
}
