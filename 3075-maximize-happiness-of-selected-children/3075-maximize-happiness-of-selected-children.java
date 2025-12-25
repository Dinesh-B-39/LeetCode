class Solution {
    public long maximumHappinessSum(int[] nums, int k) {
        Arrays.sort(nums);
        long c=0;
        // nums[nums.length-1]+=1;
        int j=0;
        for(int i=nums.length-1;i>=nums.length-k;i--)
        {
            if(nums[i]-j>=0)
            {
                c+=nums[i]-j;
            }
            else
            {
                break;
            }
            j+=1;
        }
        return c;
    }
}