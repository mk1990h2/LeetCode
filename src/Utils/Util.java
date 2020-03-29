package Utils;

import java.util.ArrayDeque;
import java.util.Queue;

public class Util {
    public static TreeNode convertArrayToTree(Integer[] array) {
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != null) {
                TreeNode current = queue.peek();
                TreeNode newNode = new TreeNode(array[i]);
                queue.offer(newNode);
                if (count == 0) {
                    current.left = newNode;
                } else {
                    current.right = newNode;
                }
            }
            count++;

            if (count == 2) {
                queue.poll();
                count = 0;
            }
        }

        return root;
    }
}
