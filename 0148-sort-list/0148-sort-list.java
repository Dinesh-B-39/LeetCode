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
    public ListNode merge(ListNode left,ListNode right)
    {
        ListNode temp1=left;
        ListNode temp2=right;
        ListNode dummy=new ListNode(-1);
        ListNode trav=dummy;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
            {
                ListNode z=temp1.next;
                temp1.next=null;
                trav.next=temp1;
                trav=trav.next;
                temp1=z;
            }
            else
            {
                ListNode z=temp2.next;
                temp2.next=null;
                trav.next=temp2;
                trav=trav.next;
                temp2=z;
            }
        }
        if(temp1!=null)
        {
            trav.next=temp1;
        }
        if(temp2!=null)
        {
            trav.next=temp2;
        }
        return dummy.next;
    }
    public ListNode Middle(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;   // ⭐ change is here
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode mergeSort(ListNode head)
    {
        if(head==null ||head.next==null)
        {
            return head;
        }
        ListNode s1=Middle(head);
        ListNode s2=s1.next;
        s1.next=null;
        ListNode left=mergeSort(head);
        ListNode right=mergeSort(s2);
        return merge(left,right);


    }
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
        
    }
}