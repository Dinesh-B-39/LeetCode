class Solution {
    public int check(int num)
    {
        int z=0;
        while(num>0)
        {
            int x=num%10;
            z=(z*10)+x;
            num=num/10;
        }
        return z;
    }
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                List<Integer> temp=new ArrayList<>();
                temp.add(i);
                map.put(nums[i],temp);
            }
            else
            {
                map.get(nums[i]).add(i);
            }
        }
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int z=check(nums[i]);
           
            if(!map.containsKey(z))
            {
                continue;
            }
            List<Integer> temp=map.get(z);
            int low=0;
            int high=temp.size()-1;
            int val=-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(temp.get(mid)>i)
                {
                    val=temp.get(mid);
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            if(val!=-1)
            {
                mine=Math.min(mine,val-i);
            }

        }
        if(mine==Integer.MAX_VALUE)
        {
            return -1;
        }
        return mine;
    }
}