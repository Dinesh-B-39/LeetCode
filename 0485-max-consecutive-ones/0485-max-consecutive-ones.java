class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] pref=new int[nums.length];
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
            pref[i]=c;
            maxe=Math.max(maxe,pref[i]);
        }
        return maxe;
    }
}