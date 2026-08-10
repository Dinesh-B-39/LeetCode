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
    List<List<Integer>> res=new ArrayList<>();
    public void check(TreeNode root,int k,List<Integer> list,int val)
    {
        if(root==null)
        {
            return;
        }
        list.add(root.val);
        val+=root.val;
        if(root.left==null && root.right==null)
        {
            if(val==k)
            {
                res.add(new ArrayList<>(list));
            }
        }
        check(root.left,k,list,val);
        check(root.right,k,list,val);
        list.remove(list.size()-1);
        k-=root.val;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list=new ArrayList<>();
        check(root,targetSum,list,0);
        return res;
        
    }
}