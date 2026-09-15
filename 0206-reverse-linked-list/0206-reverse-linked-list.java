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
    ListNode res=null;
    public void check(ListNode head,ListNode node)
    {
        if(node==null)
        {
            res=head;
            return;
        }
        if(node==head)
        {
            ListNode node1=head;
             ListNode temp=head.next;
            node1.next=null;
            check(node1,temp);
        }
        else
        {
            ListNode temp=node.next;
            node.next=head;
            check(node,temp);
        }
        
    }
    public ListNode reverseList(ListNode head) {
        check(head,head);
        return res;
        
    }
}