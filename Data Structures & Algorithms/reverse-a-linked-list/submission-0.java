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
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode h1 = head;
        ListNode h2 = null;
        while(h1!=null){
            ListNode t = h1;
            h1 = h1.next;
            t.next = h2;
            h2=t;
        }
        return h2;
    }
}
