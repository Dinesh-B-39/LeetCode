/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int flag=1;
    public void check(TreeNode p,TreeNode q)
    {
        if(p==null && q==null)
        {
            return;
        }
        if(flag==0)
        {
            return;
        }
        if(p==null || q==null)
        {
            flag=0;
            return;
        }
        if(p.val!=q.val)
        {
            flag=0;
        }
        check(p.left,q.left);
        check(p.right,q.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        check(p,q);
        return flag==1;
        
    }
}