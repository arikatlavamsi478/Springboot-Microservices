package Stack;

import java.util.Iterator;
import java.util.Stack;

public class AddElements {

    public static void main(String[] args) {


        Stack<Integer> stack_data = new Stack<>();

        stack_data.push(2);
        stack_data.push(4);
        stack_data.push(6);
        stack_data.push(8);
      //  stack_data.pop();


      //  System.out.println(stack_data);

    //   System.out.println(stack_data.pop());

        // iterate elements in LIFO order

        Iterator<Integer> iterator = stack_data.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //iterator.next();
        }

     //   System.out.println(stack_data);
     //   stack_data.printStack();


    }
}
