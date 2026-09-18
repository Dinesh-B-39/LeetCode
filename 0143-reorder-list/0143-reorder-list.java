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
    public ListNode reverse(ListNode head)
    {
        ListNode temp=head;
        ListNode cur=null;
        while(temp!=null)
        {
            ListNode temp1=temp.next;
           temp.next=cur;
            cur=temp;
            temp=temp1;
        }
        return cur;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
        {
            return;
        }
       ListNode slow=head;
       ListNode prev=null;
       ListNode fast=head;
       while(fast!=null && fast.next!=null)
       {
        prev=slow;
        slow=slow.next;
        fast=fast.next.next;
       }
       prev.next=null;
       ListNode head2=reverse(slow);
       ListNode dummy=new ListNode(-1);
       ListNode temp=dummy;
       ListNode temp1=head;
       ListNode temp2=head2;
       while(temp1!=null && temp2!=null)
       {
        ListNode cur1=temp1.next;
        temp.next=temp1;
        temp=temp.next;
        temp1=cur1;

        ListNode cur2=temp2.next;
        temp.next=temp2;
        temp=temp.next;
        temp2=cur2;
       }
       if(temp1!=null)
       {
        temp.next=temp1;
       }
       if(temp2!=null)
       {
        temp.next=temp2;
       }
       head=dummy.next;
        // return head1;
        
    }
}