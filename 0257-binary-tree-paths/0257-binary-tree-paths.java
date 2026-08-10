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
    ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public void check(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        list.add(root.val);
        if(root.left==null && root.right==null)
        {
            res.add(new ArrayList<>(list));
        }
        check(root.left,list);
        check(root.right,list);
        list.remove(list.size()-1);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        List<String> str=new ArrayList<>();
        check(root,list);
        for(int i=0;i<res.size();i++)
        {
            StringBuilder sb=new StringBuilder();
            
            int p=res.get(i).size();
            // sb.append("\"");
            for(int j=0;j<p-1;j++)
            {
                sb.append(res.get(i).get(j));
                sb.append("->");
            }
            sb.append(res.get(i).get(p-1));
            //  sb.append("\"");
             str.add(sb.toString());
            
        }

        return str;
    }
}