class Solution {
    public int rob(int[] nums) {
        int dup1=0;
        int dup2=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int s1=nums[i]+dup1;
            int s2=dup2;
            int maxe=Math.max(s1,s2);
            dup1=dup2;
            dup2=maxe;
        }
        return dup2;
    }
}