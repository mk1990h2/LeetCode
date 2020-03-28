package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/majority-element/
public class MajorityElement {
    // Boyer-Moore Majority Vote Algorithm
    public int majorityElement(int[] nums) {
        int candidate = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                candidate = nums[i];
            } else {
                if (nums[i] == candidate) count++;
                else count--;
            }
        }

        return candidate;
    }

    // sorting
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length / 2];
//    }

    // HashMap
//    public int majorityElement(int[] nums) {
//        int half = (int) Math.floor(nums.length / 2.0);
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        if (nums.length == 1) return nums[0];
//        for (int num : nums) {
//            Integer val = hm.get(num);
//            if (val == null) hm.put(num, 1);
//            else {
//                if (half < ++val) {
//                    return num;
//                }
//                hm.put(num, val);
//            }
//        }
//
//        return 0;
//    }
}
