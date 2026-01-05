class Solution {
    int fin=0;
    public void check(int[] nums,int target,int c,int ind)
    {
        if(ind==nums.length)
        {
            if(c==target)
            {
                fin+=1;
            }
            return;
        }
    
          c+=nums[ind];
          check(nums,target,c,ind+1);
          c-=nums[ind];
          c-=nums[ind];
          check(nums,target,c,ind+1);
    }
    public int findTargetSumWays(int[] nums, int target) {
        check(nums,target,0,0);
        return fin;
    }
}