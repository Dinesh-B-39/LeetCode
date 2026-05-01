class Solution {
    public int maxRotateFunction(int[] nums) {
        int res=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            res+=i*nums[i];
            sum+=nums[i];
        }
      
        int maxe=res;
        for(int i=nums.length-1;i>=0;i--)
        {
            res-=(nums[i]*(nums.length-1));
            res+=sum-nums[i];
            maxe=Math.max(maxe,res);
        }
        return maxe;
    }
}