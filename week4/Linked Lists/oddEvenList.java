/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
       if(head==null||head.next==null){
        return head;
        }
        ListNode p=head;
        ListNode p2=head.next;
        ListNode temp=p2;
        while(p2!=null&&p2.next!=null){
            p.next=p.next.next;
            p2.next=p2.next.next;
            p=p.next;
            p2=p2.next;
        }
        p.next=temp;
        return head; 
    }
}