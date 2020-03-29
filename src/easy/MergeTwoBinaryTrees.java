package easy;

import Utils.TreeNode;

// https://leetcode.com/problems/merge-two-binary-trees/
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);

        return root;
    }

//    public Utils.TreeNode mergeTreesHelper(Utils.TreeNode t1, Utils.TreeNode t2) {
//        Utils.TreeNode newNode;
//
//        if (t1 == null && t2 == null) return null;
//        if (t1 == null) {
//            newNode = new Utils.TreeNode(t2.val);
//            newNode.left = mergeTreesHelper(null, t2.left);
//            newNode.right = mergeTreesHelper(null, t2.right);
//        } else if (t2 == null) {
//            newNode = new Utils.TreeNode(t1.val);
//            newNode.left = mergeTreesHelper(t1.left, null);
//            newNode.right = mergeTreesHelper(t1.right, null);
//        } else {
//            newNode = new Utils.TreeNode(t1.val + t2.val);
//            newNode.left = mergeTreesHelper(t1.left, t2.left);
//            newNode.right = mergeTreesHelper(t1.right, t2.right);
//        }
//
//        return newNode;
//    }
}
