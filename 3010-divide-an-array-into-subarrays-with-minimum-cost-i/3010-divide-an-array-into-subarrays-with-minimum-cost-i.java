class Solution {
    public int minimumCost(int[] nums) {
        int z=nums[0];
        nums[0]=-1;
       int s1=Integer.MAX_VALUE;
        int s2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<s1)
            {
                s2=s1;
                s1=nums[i];
            }
            else if(nums[i]<s2)
            {
                s2=nums[i];
            }
        }
        return z+s1+s2;
        
    }
}