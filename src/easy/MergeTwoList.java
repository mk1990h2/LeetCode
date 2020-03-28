package easy;

// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;

        mergeTwoLists(l1, l4);

    }

    /**
     * Definition for singly-linked list.
     * public class easy.ListNode {
     * int val;
     * easy.ListNode next;
     * easy.ListNode(int x) { val = x; }
     * }
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

        // Other sol
//        if (l1 == null && l2 == null) {
//            return null;
//        }
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//        easy.ListNode result = new easy.ListNode(0);
//        easy.ListNode prev = result;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                prev.next = l1;
//                l1 = l1.next;
//            } else {
//                prev.next = l2;
//                l2 = l2.next;
//            }
//            prev = prev.next;
//        }
//        if (l1 != null) {
//            prev.next = l1;
//        }
//        if (l2 != null) {
//            prev.next = l2;
//        }
//        return result.next;
    }
}
