package easy;

import Utils.TreeNode;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

//    private int maxDepthHelper(Utils.TreeNode node, int depth) {
//        if (node == null) {
//            return depth;
//        }
//        depth++;
//        return Math.max(maxDepthHelper(node.left, depth), maxDepthHelper(node.right, depth));
//    }
}
