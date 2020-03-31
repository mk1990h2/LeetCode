package easy;

import java.util.HashSet;

// https://leetcode.com/problems/intersection-of-two-linked-lists
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }

    // my solution
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashSet<ListNode> hs = new HashSet<>();
//        while (headA != null || headB != null) {
//            if (headA != null) {
//                if (hs.contains(headA)) {
//                    return headA;
//                }
//                hs.add(headA);
//                headA = headA.next;
//            }
//            if (headB != null) {
//                if (hs.contains(headB)) {
//                    return headB;
//                }
//                hs.add(headB);
//                headB = headB.next;
//            }
//        }
//
//        return null;
//    }
}
