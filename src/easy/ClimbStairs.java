package easy;

//    https://leetcode.com/problems/climbing-stairs/
public class ClimbStairs {

    // TODO: couldn't solve by myself
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int prev2 = 1;
        int prev1 = 2;

        for (int i = 3; i < n; i++) {
            int tmp = prev2;
            prev2 = prev1;
            prev1 = prev1 + tmp;
        }

        return prev1 + prev2;
    }
}
