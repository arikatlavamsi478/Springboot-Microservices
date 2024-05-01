package StringProblems;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamProblem {

    public static void main(String[] args) {

        // Creating a Integer array
        int[] intArr = {1,2,3,4,5};

        // Creating a String array
        String[] arr = {"Geeks", "for", "Geeks"};
        Stream<String> stream = Arrays.stream(arr);

        IntStream stream1 = Arrays.stream(intArr);

        // Displaying elements in Stream
        stream.forEach(str -> System.out.print(str + " "));


    }
}
