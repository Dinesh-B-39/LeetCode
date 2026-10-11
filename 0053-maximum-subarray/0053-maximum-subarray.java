class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;
        int j=0;
        int res=0;
        int maxe=0;
        int z=Integer.MIN_VALUE;
        while(j<nums.length)
        {
            res+=nums[j];
            if(res<0)
            {
                res=0;
            }
            z=Math.max(z,nums[j]);
            maxe=Math.max(maxe,res);
            j+=1;
        }
        if(maxe==0)
        {
            return z;
        }
        return maxe;
    }
}