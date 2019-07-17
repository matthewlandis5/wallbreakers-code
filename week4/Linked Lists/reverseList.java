/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        return rev(head);
    }
    
    private ListNode rev(ListNode head){
        if(head.next==null)return head;
        ListNode p=rev(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }
}