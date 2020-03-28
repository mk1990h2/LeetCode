// https://leetcode.com/problems/single-number/
import java.util.HashMap;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans =0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }

//    public int singleNumber(int[] nums) {
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (int num : nums) {
//            if (hm.get(num) != null) hm.remove(num);
//            else hm.put(num, 1);
//        }
//        Set<Integer> keys = hm.keySet();
//        Object[] keysArray = keys.toArray();
//
//        return (int) keysArray[0];
//    }
}
