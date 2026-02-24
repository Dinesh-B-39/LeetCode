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
    ArrayList<Integer> list=new ArrayList<>();
    public void check(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        check(root.left);
        list.add(root.val);
        check(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        check(root);
        return list;
        
    }
}