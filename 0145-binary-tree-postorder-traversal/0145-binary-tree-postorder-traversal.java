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
        check(root.right);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        check(root);
        return res;
        
    }
}