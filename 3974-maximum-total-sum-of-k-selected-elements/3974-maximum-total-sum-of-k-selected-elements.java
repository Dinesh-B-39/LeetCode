class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
       
            long res=0;
        for(int i=nums.length-1;i>=nums.length-k;i--)
        {
            if(mul>0)
            {
                res+=(long)nums[i]*mul;
                mul-=1;
            }
            else
            {
                res+=nums[i];
            }
        }
        return res;
    }
}