class Solution {
    public int check(int[] nums,ArrayList<Integer> list,int target,int val)
    {
        int low=0;
        int high=list.size()-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(list.get(mid)==target)
            {
                return mid;
            }
            else if(list.get(mid)>target)
            {
                val=mid;
                high=mid-1;
            }
            else if(list.get(mid)<target)
            {
                low=mid+1;
            }


        }
       return val;
    }
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>list.get(list.size()-1))
            {
                list.add(nums[i]);
            }
            else
            {
                int m=check(nums,list,nums[i],-1);
                list.set(m,nums[i]);
            }
        }
        return list.size();
    }
}