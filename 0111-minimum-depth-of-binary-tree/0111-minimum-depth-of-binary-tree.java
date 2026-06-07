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
    int res=Integer.MAX_VALUE;;
    int c=0;
    public void check(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        c+=1;
        if(root.left==null && root.right==null)
        {
            res=Math.min(res,c);
            c-=1;
            return;
        }
        check(root.left);
        check(root.right);
        c-=1;
        
    }
    public int minDepth(TreeNode root) {
        check(root);
        if(res==Integer.MAX_VALUE)
        {
            return 0;
        }
        return res;
        
    }
}