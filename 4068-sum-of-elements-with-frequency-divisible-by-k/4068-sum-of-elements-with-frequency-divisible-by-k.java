class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] res=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            res[nums[i]]++;
        }
        int c=0;
       
        for(int i=0;i<nums.length;i++)
        {
            if(res[nums[i]]!=-1 && res[nums[i]]%k==0)
            {
                c+=nums[i]*res[nums[i]];
                
            }
           res[nums[i]]=-1;
        }
        return c;
    }
}