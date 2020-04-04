package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

// https://leetcode.com/problems/shortest-unsorted-continuous-subarray/submissions/
public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray a = new ShortestUnsortedContinuousSubarray();
        System.out.println(a.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
        System.out.println(a.findUnsortedSubarray(new int[]{1, 2, 3, 4}));
        System.out.println(a.findUnsortedSubarray(new int[]{1, 3, 2, 2, 2}));
    }

    // my sorting solution
//    public int findUnsortedSubarray(int[] nums) {
//        if (nums == null || nums.length <= 1) return 0;
//        int[] sorted = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(sorted);
//        int start = nums.length;
//        int last = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != sorted[i]) {
//                start = Math.min(start, i);
//                last = Math.max(last, i);
//            }
//        }
//        if (start == nums.length && last == -1) return 0;
//        return last - start + 1;
//    }

    // my DP solution
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 0;

        int n = nums.length;
        int start = n, last = -1;
        int max = nums[0];
        int min = nums[n - 1];
        // go through from the first to find the start index
        // go through from the end to find the last index
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            if (max != nums[i]) last = i;
            if (min != nums[n - 1 - i]) start = n - 1 - i;
        }

        if (start == n) return 0;
        return last - start + 1;

    }
}
