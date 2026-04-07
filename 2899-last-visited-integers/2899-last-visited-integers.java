class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        ArrayList<Integer> seen=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                k=0;
                seen.add(nums[i]);
            }
            else
            {
                k+=1;
                if(k>seen.size())
                {
                    ans.add(-1);
                }
                else
                {
                    int z=k-1;
                    z=seen.size()-z-1;
                    ans.add(seen.get(z));
                }
            }
        }
        return ans;
    }
}