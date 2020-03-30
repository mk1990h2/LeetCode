package easy;

import Utils.Util;
import Utils.TreeNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

// https://leetcode.com/problems/path-sum-iii/submissions/
public class PathSumIII {
    // start from the parameter node
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    // go down all the way to leaves
    private int pathSumFrom(TreeNode node, int sum) {
        if (node == null) return 0;
        return (node.val == sum ? 1 : 0)
                + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
    }

    // my answer : 22ms
//    int count = 0;
//    public int pathSum(TreeNode root, int sum) {
//        if (root == null) return 0;
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        queue.offer(root);
//        while (queue.peek() != null) {
//            TreeNode current = queue.poll();
//            if (current.left != null) queue.offer(current.left);
//            if (current.right != null) queue.offer(current.right);
//            pathSumHelper(current, sum);
//        }
//        return count;
//    }
//
//    public void pathSumHelper(TreeNode root, int sum) {
//        if (root == null) return;
//
//        int remainder = sum - root.val;
//        if (remainder == 0) {
//            count++;
//        }
//        pathSumHelper(root.left, remainder);
//        pathSumHelper(root.right, remainder);
//    }

}
