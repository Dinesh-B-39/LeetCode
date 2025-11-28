class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int i=0;
        int c=0;
        if(nums.length==1)
        {
            if(nums[0]==0) c+=1;
            return c>=n;
        }
        while(i<nums.length)
        {
            if(i==0 && nums[i]==0 && nums[i+1]==0)
            {
                c+=1;
                i+=2;
            }
            else if(i==nums.length-1 && nums[i]==0 && nums[i-1]==0)
            {
                c+=1;
                i+=2;
            }
            else if((i>0 && i<nums.length-1) && nums[i]==0 && nums[i-1]==0 && nums[i+1]==0)
            {
                c+=1;
                i+=2;
            }
            else
            {
                i+=1;
            }

        }
        return c>=n;
    }
}