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
     TreeNode res=null;
     public void check(TreeNode root,int val)
     {
        if(root==null || res!=null)
        {
            return;
        }
        if(root.val==val)
        {
            res=root;
            return;
        }
        if(val<root.val)
        {
            check(root.left,val);
        }
        else
        {
            check(root.right,val);
        }
     }
    public TreeNode searchBST(TreeNode root, int val) {
        check(root,val);
        return res;
        
    }
}