package StringProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(21);
        arrayList.add(31);
        arrayList.add(20);

      //  Stream.of(arrayList).filter(x->x.contains("a")).collect(Collectors.toList()).forEach(System.out::println);
// Integer I = new Integer(15);    //Integer Object
//        int i = I;
      //  Stream.of(arrayList).filter(x -> x.intValue() % 2 != 0).collect(Collectors.toList());

        /*List<Integer> oddList = Stream.of(arrayList.toArray(new Integer[0]))
                .mapToInt(Integer::intValue)
                .filter(x -> x % 2 != 0)
                .boxed()
                .collect(Collectors.toList());*/
      //  Stream.of(arrayList).filter(x -> (x % 2 != 0).collect(Collectors.toList()));
       List<Integer> string = Stream.of(arrayList)
               // .flatMapToInt(l -> l.stream().mapToInt(Integer::intValue))
               .flatMapToInt(y->y.stream().mapToInt(Integer::intValue))
                .filter(x -> x % 2 != 0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(string);

       // System.out.println(oddList); // Output: [1, 3, 5]

    }
}
