class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxe=-1;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c=0;
            }
            else
            {
                c+=1;
            }
           
            maxe=Math.max(maxe,c);
        }
        return maxe;
    }
}