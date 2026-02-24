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
    ArrayList<String> list=new ArrayList<>();
    public void check(TreeNode root,String s)
    {
        if(root==null)
        {
            return;
        }

        if(root.left==null && root.right==null){
            
            list.add(s+root.val);
            return;

        }

        check(root.left,s+root.val);
      
        check(root.right,s+root.val);
        

    }
    public int sumRootToLeaf(TreeNode root) {
    
        check(root,"");
        int tot=0;
        for(int i=0;i<list.size();i++)
        {
            // System.out.println(list.get(i));
            tot+=Integer.parseInt(list.get(i),2);
        }


        return tot;
    }
}