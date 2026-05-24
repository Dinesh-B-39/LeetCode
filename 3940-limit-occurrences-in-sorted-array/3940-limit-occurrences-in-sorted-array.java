class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int c=1;
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                c=1;
                list.add(nums[i]);

            }
            else
            {
                if(c==k)
                {
                    continue;
                }
                else
                {
                    list.add(nums[i]);
                    c+=1;
                }
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}