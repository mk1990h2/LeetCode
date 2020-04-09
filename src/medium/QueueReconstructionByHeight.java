package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/queue-reconstruction-by-height/
public class QueueReconstructionByHeight {
    public static void main(String[] args) {
        QueueReconstructionByHeight a = new QueueReconstructionByHeight();
        System.out.println(Arrays.deepToString(a.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}})));
    }

    // TODO:
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                if (ints[0] == t1[0]) {
                    return ints[1] - t1[1];
                }
                return t1[0] - ints[0];
            }
        });

        List<int[]> list = new LinkedList<>();
        for (int[] p : people) {
            list.add(p[1], p);
        }

        return list.toArray(new int[people.length][]);
    }
}
