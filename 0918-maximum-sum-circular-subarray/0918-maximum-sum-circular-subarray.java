class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int temp1=0;
        int maxe=Integer.MIN_VALUE;

        int temp2=0;
        int mine=Integer.MAX_VALUE;

        int tot=0;

        for(int i=0;i<nums.length;i++)
        {
            temp1+=nums[i];
            maxe=Math.max(maxe,temp1);

            if(temp1<0)
            {
                temp1=0;
            }

            tot+=nums[i];

            temp2+=nums[i];
            mine=Math.min(mine,temp2);
            if(temp2>0)
            {
                temp2=0;
            }
        }
        if(tot==mine)
        {
            return maxe;
        }
        return Math.max(maxe,tot-mine);
    }
}