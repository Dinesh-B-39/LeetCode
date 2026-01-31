class Solution {
    // int res=0;
    public int check(int[] nums,int target,int[] dp)
    {
        // if(target==0)
        // {
        //     res+=1;
        //     return;
        // }
        if(dp[target]!=-1)
        {
            return dp[target];
        }
        int zoo=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=target)
            {
                zoo+=check(nums,target-nums[i],dp);
            }
        }
        dp[target]=zoo;
        return zoo;
    }
    public int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        return check(nums,target,dp);
        
        
    }
}