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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        
        ListNode temp1=l1;
        ListNode temp2=l2;

        int carry=0;
        while(temp1!=null && temp2!=null)
        {
            int c1=temp1.val+temp2.val+carry;
            carry=c1/10;
            ListNode doop=new ListNode(c1%10);
            temp.next=doop;
            temp=temp.next;

            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null)
        {
            int c2=temp1.val+carry;
            carry=c2/10;
            ListNode doop2=new ListNode(c2%10);
            temp.next=doop2;
            temp=temp.next;

            temp1=temp1.next;

        }
        while(temp2!=null)
        {
            int c2=temp2.val+carry;
            carry=c2/10;
            ListNode doop2=new ListNode(c2%10);
            temp.next=doop2;
            temp=temp.next;

            temp2=temp2.next; 
        }
        while(carry!=0)
        {
          ListNode doop4=new ListNode(carry%10);
            temp.next=doop4;
            temp=temp.next;

            carry=carry/10;

        }
        return dummy.next;
    }
}