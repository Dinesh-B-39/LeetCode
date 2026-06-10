class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res=new int[nums.length];
        int j=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                res[j]=nums[i];
                j+=1;
            }
            if(nums[i]==pivot)
            {
                c+=1;
            }
        }
        while(c>0)
        {
            res[j]=pivot;
            j+=1;
            c-=1;
        }
         for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>pivot)
            {
                res[j]=nums[i];
                j+=1;
            }
        }
        return res;
    }
}