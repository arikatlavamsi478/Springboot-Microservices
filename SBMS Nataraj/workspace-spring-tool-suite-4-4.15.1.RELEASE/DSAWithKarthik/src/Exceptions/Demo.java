package Exceptions;

public class Demo {
    public static void main(String[] args) {
        try
        {
            System.out.print("Hello" + " " + 1 / 0);
            System.out.print(0/1);
        }
        catch(ArithmeticException ex){
            System.out.print("Java"+" ");
        }
        catch(NullPointerException ax)
        {
            System.out.print("World");
        }
    }
}
