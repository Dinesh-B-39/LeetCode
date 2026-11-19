class Solution {
    public void moveZeroes(int[] nums) {
        int st=0;
        int end=nums.length-1;
        while(st<end)
        {
            if(nums[st]==0)
            {
                for(int i=st+1;i<=end;i++)
                {
                    nums[i-1]=nums[i];
                }
                nums[end]=0;
                end-=1;

            }
            else
            {
                st+=1;
            }
        }
        
    }
}