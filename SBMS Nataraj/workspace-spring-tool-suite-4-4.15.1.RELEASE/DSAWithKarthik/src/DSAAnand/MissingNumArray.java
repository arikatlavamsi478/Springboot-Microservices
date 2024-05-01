package DSAAnand;

public class MissingNumArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 5, 7, 8, 6, 9, 10, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == j) {
                    System.out.println(arr[i]);
                }

            }
        }
    }
}
