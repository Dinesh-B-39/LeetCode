class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum1=0;

        int sum2=0;

        int maxe=Integer.MIN_VALUE;
        int mine=Integer.MAX_VALUE;
        int totsum=0;
        for(int i=0;i<nums.length;i++)
        {
            totsum+=nums[i];

            sum1+=nums[i];
            maxe=Math.max(maxe,sum1);
            if(sum1<0)
            {
                sum1=0;
            }

            sum2+=nums[i];
            mine=Math.min(mine,sum2);
            if(sum2>0)
            {
                sum2=0;
            }
        }
        if(totsum==mine)
        {
            return maxe;
        }
        return Math.max(maxe,totsum-mine);
        
    }
}