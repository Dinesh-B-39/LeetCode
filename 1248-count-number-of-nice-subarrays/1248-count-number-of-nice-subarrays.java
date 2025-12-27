class Solution {
    public int check(int[] nums,int k)
    {
        int i=0;
        int j=0;
        int z=0;
        int c=0;
        while(j<nums.length)
        {
            z+=nums[j];
            while(z>k)
            {
                z-=nums[i];
                i+=1;
            }
            c+=j-i+1;
            j+=1;
        }
        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                nums[i]=0;
            }
            else
            {
                nums[i]=1;
            }
        }
        int n1=check(nums,k);
        int n2=check(nums,k-1);
        return n1-n2;
        
    }
}