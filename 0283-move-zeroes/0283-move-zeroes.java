class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(i<nums.length && j<nums.length)
        {
            if(nums[i]!=0)
            {
                i+=1;
                j+=1;
            }
            else
            {
                while(j<nums.length && nums[j]==0)
                {
                    j+=1;
                }
                if(j<nums.length)
                {
                    nums[i]=nums[j];
                nums[j]=0;
                i+=1;
                j+=1;
                }
                
            }
        }
      
    }
}