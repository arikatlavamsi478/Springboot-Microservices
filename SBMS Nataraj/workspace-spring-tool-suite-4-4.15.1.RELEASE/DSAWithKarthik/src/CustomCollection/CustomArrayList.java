package CustomCollection;

import java.util.Arrays;

public class CustomArrayList {

    Object[] arr;
    int index = 0;

    CustomArrayList(){
        arr= new Object[8];

    }

    boolean add(Object obj) {
        capacityCheck();
        arr[index]=obj;
      //  index=index+1;
        index++;
        return true;
    }

     void capacityCheck() {

        if(index >= arr.length) {
            grow();
        }
    }

     void grow() {
        int newSize=(int) ((arr.length)+(arr.length*0.6));
         arr=Arrays.copyOf(arr, newSize);
    }

    @Override
    public String toString() {
       // StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length ; i++) {
            sb.append(arr[i]+" ");
        }
        sb.append("]");
        return sb.toString();
    }

    Object get(int index) {
        rangeCheck(index);
        return arr[index];

    }

     void rangeCheck(int index) {
        if(index>= arr.length){
         //  throw new ArrayIndexOutOfBoundsException("ejejejej");
           throw new InternalError();
           // throw new IllegalArgumentException("ahahahahah");
        }
    }
}
