package medium.DP;

// https://leetcode.com/problems/counting-bits/

/**
 * Explanation:
 * First of all, I examine several numbers to find out the pattern.
 * [0]: 000 -> 0
 * [1]: 001 -> 1
 * [2]: 010 -> 1
 * [3]: 011 -> 2
 * [4]: 100 -> 1
 * [5]: 101 -> 2
 * [6]: 110 -> 2
 * [7]: 111 -> 3
 * Now I can see the pattern. It is a kind of loop from 1 to 2 power of x.
 * As you can see, 2 power of x is always 1. How about other numbers?
 * For example, 5 can be represented like this: [1] + 1.
 * 6 can be represented like this: [2] + 1.
 * Needless to say, 7 can be represented like this: [3] + 1.
 * So, regarding 2 power of x as a starting point, I can refer to corresponding index.
 *
 * Time Complexity: O(n)
 * Space: n
 */
public class CountingBits {
    public int[] countBits(int num) {
        if (num == 0) return new int[]{0};

        int[] arr = new int[num + 1];
        arr[0] = 0;
        int index = 0;
        int partition = 1;
        for (int i = 1; i <= num; i++) {
            if (i == partition) {
                arr[i] = 1;
                partition *= 2;
                index = 1;
            } else {
                arr[i] = arr[index] + 1;
                index++;
            }
        }

        return arr;
    }
}
