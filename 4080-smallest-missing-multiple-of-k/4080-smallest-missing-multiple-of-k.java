class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] arr=new int[1001];
        int maxe=-1;
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]=1;
            maxe=Math.max(maxe,nums[i]);
        }
        int i=0;
        for(i=1;i<=maxe;i++)
        {
            if(arr[i*k]==0)
            {
                return i*k;
            }
        }
        if(k==1)
        {
             return i*k;
        }
        return (i*k)+k;
        
    }
}