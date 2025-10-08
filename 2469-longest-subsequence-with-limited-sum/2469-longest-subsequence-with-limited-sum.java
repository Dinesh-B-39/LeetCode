class Solution {
    public int bsearch(int target,int[] nums,int l,int r)
    {
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]<=target)
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
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int c=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            c+=nums[i];
            nums[i]=c;
        }
        for(int i=0;i<queries.length;i++)
        {
            queries[i]=bsearch( queries[i],nums,0,nums.length-1)+1;
        }
        return queries;
    }
}