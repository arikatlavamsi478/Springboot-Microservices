package DSAAnand;

public class MaxElementArray {

    public static void main(String[] args) {

        int [] array = new int [] {3,5,10,98,6};

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
