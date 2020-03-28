package easy;

//    https://leetcode.com/problems/climbing-stairs/
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(6));
    }

    public static int climbStairs(int n) {
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
