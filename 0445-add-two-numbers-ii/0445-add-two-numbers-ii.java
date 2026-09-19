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
        ListNode curr=null;
        while(head!=null)
        {
            ListNode temp=head.next;
            head.next=curr;
            curr=head;
            head=temp;
        }
        return curr;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode h1=reverse(l1);
        ListNode h2=reverse(l2);
        ListNode temp1=h1;
        ListNode temp2=h2;
        int carry=0;
        while(temp1!=null || temp2!=null || carry!=0)
        {
            int val=0;
            if(temp1!=null)
            {
                val+=temp1.val;
            }

            if(temp2!=null)
            {
                val+=temp2.val;
            }

            if(carry!=0)
            {
                val+=carry;
            }

            if(temp1!=null)
            {
                ListNode tempo=temp1.next;
                temp1.val=val%10;
                carry=val/10;
                temp.next=temp1;
                temp=temp.next;
                temp.next=null;
                temp1=tempo;
                if(temp2!=null)
                {
                    temp2=temp2.next;
                }
            }
            else if(temp2!=null)
            {
                ListNode tempo=temp2.next;
                temp2.val=val%10;
                carry=val/10;
                temp.next=temp2;
                temp=temp.next;
                temp.next=null;
                temp2=tempo;
                if(temp1!=null)
                {
                    temp1=temp1.next;
                }
            }
            else
            {
                temp.next=new ListNode(carry);
                carry-=carry;

            }
        }
        return reverse(dummy.next);
    }
}