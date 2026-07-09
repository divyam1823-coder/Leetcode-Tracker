// Last updated: 7/9/2026, 3:20:43 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }
        if(size==n)
        {
            return head.next;
        }
        temp = head;
        int k = size-n-1;
        while(k>0)
        {
            temp = temp.next;
            k--;
        }
        if(temp.next!=null && temp.next.next==null) 
        {
            temp.next = null;
            return head;
        }

        temp.next = temp.next.next;
        return head;
    }
}