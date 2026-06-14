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
    public ListNode reverse(ListNode head,ListNode dummy)
    {
        if(head==null)
        {
            return dummy;
        }
        if(dummy==null)
        {
            ListNode temp=head.next;
            head.next=null;
            return reverse(temp,head);
        }
        ListNode temp=head.next;
        head.next=dummy;
        dummy=head;
        return reverse(temp,dummy);

    }
    public int pairSum(ListNode head) {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c+=1;
            temp=temp.next;
        }
        int s=1;
        temp=head;
        int z=(c/2);
        while(s<z)
        {
            temp=temp.next;
            s+=1;
        }
       
        ListNode head2=temp.next;
        temp.next=null;
        // ListNode dummy=new ListNode(head2.val);
        // dummy.next=null;
        ListNode dummy=null;
        head2=reverse(head2,dummy);
        ListNode temp1=head;
        ListNode temp2=head2;
        // while(temp2!=null)
        // {
        //     System.out.print(temp2.val+" ");
        //     temp2=temp2.next;
        // }
        int maxe=Integer.MIN_VALUE;
        while(temp1!=null)
        {
            maxe=Math.max(maxe,temp1.val+temp2.val);
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return maxe;
    }
}