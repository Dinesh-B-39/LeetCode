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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode h1=reverse(l1);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        // ListNode h2=reverse(l2);
        int carry=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null && temp2!=null)
        {
            int val=temp1.val+temp2.val+carry;
            temp1.val=val%10;
            carry=val/10;
            ListNode tempo=temp1.next;
            temp.next=temp1;
            temp=temp.next;
            temp.next=null;
            temp1=tempo;
            temp2=temp2.next;
        }
       while(temp1!=null)
       {
            int val=temp1.val+carry;
            temp1.val=val%10;
            carry=val/10;
            ListNode tempo=temp1.next;
            temp.next=temp1;
            temp=temp.next;
            temp.next=null;
            temp1=tempo;
       }
       while(temp2!=null)
       {
            int val=temp2.val+carry;
            temp2.val=val%10;
            carry=val/10;
            ListNode tempo=temp2.next;
            temp.next=temp2;
            temp=temp.next;
            temp.next=null;
            temp2=tempo;
       }
       if(carry!=0)
       {
        temp.next=new ListNode(carry);
       }
        return dummy.next;
    }
}