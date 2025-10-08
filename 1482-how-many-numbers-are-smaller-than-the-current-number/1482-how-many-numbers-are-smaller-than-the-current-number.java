class Solution {
    public int bsearch(int l,int r,int target,int[] res)
    {
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(res[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return r;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res[i]=nums[i];
        }
        Arrays.sort(res);
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=bsearch(0,nums.length-1,nums[i],res)+1;
        }

        return nums;
    }
}