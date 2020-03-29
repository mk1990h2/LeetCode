package easy;

import Utils.TreeNode;

// https://leetcode.com/problems/diameter-of-binary-tree/
public class DiameterOfBinaryTree {
    // TODO: I couldn't solve by my self
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTreeHelper(root);
        return max;
    }

    private int diameterOfBinaryTreeHelper(TreeNode root) {
        if (root == null) return 0;

        int left = diameterOfBinaryTreeHelper(root.left);
        int right = diameterOfBinaryTreeHelper(root.right);
        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }
}
