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
    public ListNode modifiedList(int[] nums, ListNode head) {
         HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode trav=head;
        while(trav!=null)
        {
            if(!set.contains(trav.val))
            {
                temp.next=trav;
                temp=temp.next;
            }
            trav=trav.next;

        }
        return dummy.next;
    }
}