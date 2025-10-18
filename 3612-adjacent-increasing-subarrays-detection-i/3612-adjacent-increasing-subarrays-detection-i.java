class Solution {
    public boolean check(int s1,int s2,int s3,List<Integer> nums)
    {
        for(int i=s1+1;i<s2;i++)
        {
           
            if(nums.get(i)<=nums.get(i-1))
            {
                return false;
            }
        }
        for(int j=s2+1;j<s3;j++)
        {
            
            if(nums.get(j)<=nums.get(j-1))
            {
                return false;
            }
        }
        return true;
    }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        // if(k==1 && nums.size()>=k)
        // {
        //     return true;
        // }
        for(int i=0;i<=nums.size()-(2*k);i++)
        {
            if(check(i,i+k,i+k+k,nums))
            {
                return true;
            }
        }
        return false;
    }
}