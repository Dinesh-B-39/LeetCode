class Solution {
    public void reverse(int[] nums,int i,int j)
    {
        while(i<=j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i+=1;
            j-=1;
        }
    }
    public void nextPermutation(int[] nums) {
        int k=-1;
        int p=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                k=i+1;
                p=i;
                break;
            }
        }
        if(k==-1)
        {
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>nums[p])
            {
                int temp=nums[i];
                nums[i]=nums[p];
                nums[p]=temp;
                break;
            }
        }
        reverse(nums,k,nums.length-1);
    }
}