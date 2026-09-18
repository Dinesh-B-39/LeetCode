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
        ListNode prev=null;
        while(head!=null)
        {
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        {
            return head;
        }
        int length=0;
        ListNode temp=head;
        while(temp!=null)
        {
            length+=1;
            temp=temp.next;
        }
        k=k%length;
        if(k==0)
        {
            return head;
        }
        ListNode head1=reverse(head);
        int c=1;
        ListNode prev=null;
        temp=head1;
        if(k==1)
        {
            head1.next=reverse(head1.next);
            return head1;
        }
        else
        {
            ListNode s1=head1;
            while(temp!=null)
            {
                if(c==k)
                {
                    ListNode x1=temp.next;
                    temp.next=null;
                    head=reverse(head1);
                    s1.next=reverse(x1);
                    return head;
                }
                else
                {
                    temp=temp.next;
                    c+=1;
                }
            }

        }
        return null;
        
    }
}