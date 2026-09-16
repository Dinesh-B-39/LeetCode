/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        int c=0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            if(slow==fast)
            {
                if(c==0)
                {
                    c+=1;
                }
                else
                {
                    return true;
                }
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}