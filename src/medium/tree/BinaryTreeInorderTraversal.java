package medium.tree;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
public class BinaryTreeInorderTraversal {
    // TODO
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }

        return list;
    }

    // recursive
//    public List<Integer> inorderTraversal(TreeNode root) {
//        if (root == null) return null;
//        // recursive
//        List<Integer> result = new ArrayList<>();
//        List<Integer> left = inorderTraversal(root.left);
//        List<Integer> right = inorderTraversal(root.right);
//        if (left != null) result.addAll(left);
//        result.add(root.val);
//        if (right != null) result.addAll(right);
//
//        return result;
//    }
}
