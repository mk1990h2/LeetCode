package easy;

// https://leetcode.com/problems/house-robber/
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prevThree = 0;
        int prevTwo = nums[0];
        int prevOne = nums[1];
        int max = Math.max(prevOne, prevTwo);
        for (int i = 2; i < nums.length; i++) {
            int tmp = nums[i] + Math.max(prevTwo, prevThree);
            prevThree = prevTwo;
            prevTwo = prevOne;
            prevOne = tmp;
            max = Math.max(max, prevOne);
        }

        return max;
    }
}
