package DSAAnand;

public class MissingNumArrayApproach2 {

    public static void main(String[] args) {

        int [] num = {1,2,4,5,6,7,8,9,10};

        int  n = 10;
        int sum =  n * (n+1)/2;

        int result = 0;
        for (int i = 0; i < num.length; i++) {
            result = result + num[i];
        }

       int result1 = sum - result;
       System.out.println(result1);
    }
}
