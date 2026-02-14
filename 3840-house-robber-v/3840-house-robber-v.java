class Solution {
    public long rob(int[] nums, int[] colors) {
        long temp1=0;
        long temp2=nums[0];
        long maxe=temp2;
        for(int i=1;i<nums.length;i++)
        {
            if(colors[i]==colors[i-1])
            {
                temp1+=nums[i];
                long temp3=Math.max(temp1,temp2);
                temp1=temp2;
                temp2=temp3;
            }
            else
            {
                temp1=temp2;
                temp2+=nums[i];
            }
        }
        return temp2;
    }
}