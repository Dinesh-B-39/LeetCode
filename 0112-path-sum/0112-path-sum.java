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
    boolean flag=false;
    public void check(TreeNode root,int target,int k)
    {
        if(root.left==null && root.right==null)
        {
            if(k+root.val==target)
            {
                flag=true;
            }
        }
        if(root.left!=null)
        {
            check(root.left,target,k+root.val);
        }
        if(root.right!=null)
        {
            check(root.right,target,k+root.val);
        }
        
    }
    public boolean hasPathSum(TreeNode root, int target) {
        if(root==null){return false;}
        check(root,target,0);
        return flag;
        
    }
}