class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxe=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                c+=1;
            }
            else
            {
                maxe=Math.max(maxe,c);
                c=0;
            }
        }
        maxe=Math.max(maxe,c);
        return maxe;
    }
}