package HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {


    public static void twoSum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i< nums.length; i++) {
            int diff = k - nums[i];
           // set.add(nums[i]);
            if (set.contains(diff)) {
                System.out.println(
                        "Pair with given sum "
                                + k + " is (" + nums[i]
                                + ", " + diff + ")");
            }
          //  System.out.println("false");
            set.add(nums[i]);
        }
      //  System.out.println(false);


    }
    public static void main(String[] args) {
        int nums[] = { 1, 4, 45, 6, 10, 8, 8, 15, 12 };
        int k = 16;
       TwoSum.twoSum(nums, k);




    }
}
