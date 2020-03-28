package easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllNumbersDisappearedInAnArray {
    // TODO: couldn't solve by myself
    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray a = new FindAllNumbersDisappearedInAnArray();
        a.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        for (int num : nums) {
            int val = Math.abs(num) - 1;
            if (nums[val] > 0) nums[val] = -nums[val];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) missing.add(i + 1);
        }

        return missing;
    }

//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> missing = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
//                int tmp = nums[i];
//                nums[i] = nums[tmp - 1];
//                nums[tmp - 1] = tmp;
//            }
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (i + 1 != nums[i]) missing.add(i + 1);
//        }
//
//        return missing;
//    }
}
