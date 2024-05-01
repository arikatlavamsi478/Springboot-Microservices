package DSAAnand;

import java.util.Arrays;

public class MissingNumArrayApproach3 {

    public static void main(String[] args) {

        int[] num = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(num);

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] + 1 != num[i+1]) {
                System.out.println(num[i] + 1);
            }
        }
    }
}

