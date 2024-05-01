package Exceptions;

import java.io.IOException;

public class ExceptionBrush {
    public static void main(String[] args) {
        try {
            int x = 0;
            throw new Exception("Hello ");

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
       /* catch (IOException e) {
            System.out.print(e.getMessage());
        } */finally {
            System.out.println("World");
        }
    }
}