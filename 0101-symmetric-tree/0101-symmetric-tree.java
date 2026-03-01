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
    public void check(TreeNode root1,TreeNode root2)
    {
        if(root1==null && root2==null)
        {
            return;
        }
        if(flag==0)
        {
            return;
        }
         if(root1==null || root2==null)
        {
            flag=0;
            return;
        }
        if(root1.val!=root2.val)
        {
            flag=0;
        }
       
        check(root1.left,root2.right);
        check(root1.right,root2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        check(root,root);
        return flag==1;
    }
}