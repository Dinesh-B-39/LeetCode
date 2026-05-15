class Solution {
    public boolean isGood(int[] nums) {
        int[] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums.length-1)
            {
                return false;
            }
            temp[nums[i]]+=1;
        }
        for(int i=1;i<temp.length-1;i++)
        {
            if(temp[i]==0)
            {
                return false;
            }
        }
        if(temp[temp.length-1]!=2)
        {
            return false;
        }
        return true;
    }
}