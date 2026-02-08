class Solution {
    public int check(int k,int[] nums)
    {
        int i=0;
        int j=0;
        int fin=0;
        int c=0;
        while(j<nums.length)
        {
            c+=nums[j];
            while(c>k)
            {
                c-=nums[i];
                i+=1;
            }
            fin+=j-i+1;
            j+=1;
        }
        return fin;
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
        int m=check(k,nums);
        int n=check(k-1,nums);
        return m-n;
        
    }
}