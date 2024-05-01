package HashMapDuplicate;

import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {

        Employee e1 = new Employee("vamsi", 454);
        Employee e2 = new Employee("krishna", 454);
        Employee e3 = new Employee("sruthi", 478);

        Map<Employee, String> map1 = new HashMap<Employee, String>();

        map1.put(e1, "first");
        map1.put(e2, "second");
        map1.put(e3, "third");

      //  map1.put(s1, "first");
      //  map1.put(s2, "second");
      //  map1.put(e3, "third");
        System.out.println(map1);


        System.out.println(map1.size());

    }
}
