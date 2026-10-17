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
    List<Integer> res=new ArrayList<>();
    public void check(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            res.add(root.val);
            return;
        }
        check(root.left);
        res.add(root.val);
        check(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        check(root);
        return res;
        
    }
}