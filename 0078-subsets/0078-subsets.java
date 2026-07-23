class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void check(int ind,int[] nums,ArrayList<Integer> list)
    {
        if(ind==nums.length)
        {
            res.add(new ArrayList<Integer>(list));
            return;
        }
        list.add(nums[ind]);
        check(ind+1,nums,list);
        list.remove(list.size()-1);
        check(ind+1,nums,list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        check(0,nums,list);
        return res;
        
    }
}