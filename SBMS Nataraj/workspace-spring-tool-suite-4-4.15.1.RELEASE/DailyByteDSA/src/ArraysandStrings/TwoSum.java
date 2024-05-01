package ArraysandStrings;

import java.util.HashMap;

public class TwoSum {

    //  int[] nums = {2,3,4,5};

    public static void twoSum(int[] nums, int k) {

        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == k){
                    // return true;
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }

            }
        }
        // return false;
        // System.out.println("false");
    }
    public static void main(String[] args) {
        TwoSum.twoSum(new int[]{2, 3,5, 6}, 5);




    }
}
