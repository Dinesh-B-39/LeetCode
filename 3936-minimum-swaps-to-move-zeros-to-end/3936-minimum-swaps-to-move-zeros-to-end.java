class Solution {
    public int minimumSwaps(int[] nums) {
        int i=0;
        int c=0;
        int j=nums.length-1;
        while(i<j)
        {
            if(nums[i]==0)
            {
                if(nums[j]!=0)
                {
                    c+=1;
                    j-=1;
                    i+=1;
                }
                else
                {
                    j-=1;
                }
            }
            else
            {
                i+=1;
            }
        }
        return c;
    }
}