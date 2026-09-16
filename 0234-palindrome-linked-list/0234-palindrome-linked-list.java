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
    public void reverse(ListNode cur,ListNode head)
    {
        if(cur==null)
        {
            res=head;
            return;
        }
        if(cur==head)
        {
            ListNode temp=head.next;
            head.next=null;
            reverse(temp,head);
        }
        else
        {
            ListNode temp=cur.next;
            cur.next=head;
            reverse(temp,cur);
        }
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        {
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        reverse(slow,slow);
        ListNode r1=head;
        while(r1!=null)
        {
            System.out.print(r1.val+" ");
            r1=r1.next;
        }
        ListNode temp1=head;
        ListNode temp2=res;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val!=temp2.val)
            {
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
}