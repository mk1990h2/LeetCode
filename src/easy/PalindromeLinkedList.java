package easy;

import Utils.ListNode;
import Utils.Util;

// https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,1};
        PalindromeLinkedList a = new PalindromeLinkedList();
        a.isPalindrome(Util.convertArrayToListNode(arr));
    }

    ListNode ref;
    public boolean isPalindrome(ListNode head) {
        ref = head;
        return check(head);
    }

    public boolean check(ListNode node){
        if(node == null) return true;
        boolean ans = check(node.next);
        boolean isEqual = (ref.val == node.val)? true : false;
        ref = ref.next;
        return ans && isEqual;
    }

    // my solution
//    public boolean isPalindrome(ListNode head) {
//        if (head == null || head.next == null) return true;
//        while (head != null) {
//            ListNode node = getSecondLastNode(head);
//            if (node == null) break;
//            if (head.val != node.next.val) return false;
//            node.next = null;
//            head = head.next;
//        }
//
//        return true;
//    }
//
//    private ListNode getSecondLastNode(ListNode node) {
//        if (node.next == null) return null;
//        if (node.next.next == null) return node;
//
//        ListNode current = node.next;
//        while (current.next.next != null) {
//            current = current.next;
//        }
//        return current;
//    }
}
