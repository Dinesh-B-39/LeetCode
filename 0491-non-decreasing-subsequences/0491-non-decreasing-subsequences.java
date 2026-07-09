class Solution {
    HashSet<List<Integer>> res=new HashSet<>();
    public void check(int[] nums,int ind,ArrayList<Integer> list,int prev)
    {
        if(ind==nums.length)
        {
            if(list.size()>=2 && !res.contains(list))
            {
                res.add(new ArrayList<>(list));
            }
            return;
        }
       
        if(prev==-1 || nums[ind]>=nums[prev])
        {
            list.add(nums[ind]);
            check(nums,ind+1,list,ind);
            list.remove(list.size()-1);
        }
        check(nums,ind+1,list,prev);
            


    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        check(nums,0,list,-1);
        return  new ArrayList<>(res);

        
    }
}