class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int j=0;
        int maxe=0;
        while(j<nums.length)
        {
            if(nums[j]==1)
            {
                j+=1;
            }
            else
            {
                maxe=Math.max(maxe,j-i);
                i=j+1;
                j=i;
            }
        }
        maxe=Math.max(maxe,j-i);
        return maxe;
    }
}