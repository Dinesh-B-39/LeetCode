class Solution {
    public int check(int[] nums,int goal)
    {
        if(goal<0)
        {
            return 0;
        }
        int c=0;
        int i=0;
        int sum=0;
        int j=0;
        while(j<nums.length)
        {
            sum+=nums[j];
            while(sum>goal)
            {
                sum-=nums[i];
                i+=1;
            }
            c+=j-i+1;
            j+=1;
        }
        return c;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n1=check(nums,goal);
        int n2=check(nums,goal-1);
        return n1-n2;
    }
}