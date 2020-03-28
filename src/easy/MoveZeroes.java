package easy;

// https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
    // O(n)
    public void moveZeroes(int[] nums) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[position++] = nums[i];
        }
        while (position < nums.length) {
            nums[position++] = 0;
        }
    }

    // bubble sort
//    public void moveZeroes(int[] nums) {
//        int n = nums.length-1;
//        while (n > 0) {
//            for (int i = 0; i < n; i++) {
//                if (nums[i] == 0) {
//                    int tmp = nums[i+1];
//                    nums[i+1] = nums[i];
//                    nums[i] = tmp;
//                }
//            }
//            n--;
//        }
//    }
}
