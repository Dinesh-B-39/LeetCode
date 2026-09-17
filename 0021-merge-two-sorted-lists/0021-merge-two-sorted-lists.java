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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode temp=dummy;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
            {
                ListNode cur=temp1.next;
                temp.next=temp1;
                temp=temp.next;
               
                temp1=cur;
            }
            else
            {
                ListNode cur=temp2.next;
                temp.next=temp2;
                temp=temp.next;
                
                temp2=cur;
            }
        }
        if(temp1!=null)
        {
            temp.next=temp1;
        }
        if(temp2!=null)
        {
            temp.next=temp2;
        }
       return dummy.next; 
    }
}