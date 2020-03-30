package easy;

import java.util.HashSet;

// https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
    
    // my solution
//    public boolean hasCycle(ListNode head) {
//        HashSet<ListNode> hs = new HashSet<>();
//        while (head != null) {
//            if (hs.contains(head)) return true;
//            else hs.add(head);
//            head = head.next;
//        }
//
//        return false;
//    }
}
