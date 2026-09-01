class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void check(int ind,ArrayList<Integer> list,int[] nums)
    {
        if(ind==nums.length)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[ind]);
        check(ind+1,list,nums);
        list.remove(list.size()-1);
        check(ind+1,list,nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        check(0,list,nums);
        return res;
        
    }
}