// Last updated: 7/9/2026, 3:19:49 PM
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int count = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        k %= count;
        if (k == 0) return head;
        temp.next = head;
        int steps = count - k;
        ListNode newTail = head;
        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}