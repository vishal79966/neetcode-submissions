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
    public int size(ListNode head){
        int cnt =0;
        ListNode t = head;
        while(t!=null){
            t = t.next;
            cnt++;
        } 
        return cnt;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int size = size(head);
        if(size == n){
            return head.next;
        }
        int p = size-n-1;
        ListNode t = head;
        while(p-1>=0){
            t = t.next;
            p--;
        }
        t.next = t.next.next;
        return head;

    }
}
