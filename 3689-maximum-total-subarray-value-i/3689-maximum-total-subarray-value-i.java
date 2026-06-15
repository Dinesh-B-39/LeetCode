class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int maxe=Integer.MIN_VALUE;
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            maxe=Math.max(maxe,nums[i]);
            mine=Math.min(mine,nums[i]);
        }
        return ((long)(maxe-mine)*k);
        
    }
}