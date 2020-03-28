package easy;

// https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
    public ListNode reverseListRecursively(ListNode head) {
        if (head == null) return null;
        ListNode next = head.next;
        head.next = null;
        return reverseListRecursivelyHelper(head, next);
    }

    private ListNode reverseListRecursivelyHelper(ListNode head, ListNode next) {
        if (next == null) return head;
        ListNode tmp = next.next;
        next.next = head;

        return reverseListRecursivelyHelper(next, tmp);
    }

    public ListNode reverseListIteratively(ListNode head) {
        if (head == null) return null;
        ListNode next = head.next;
        head.next = null;
        while (next != null) {
            ListNode tmp = next.next;
            next.next = head;
            head = next;
            next = tmp;
        }

        return head;
    }
}
