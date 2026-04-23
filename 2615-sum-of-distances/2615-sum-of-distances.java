class Solution {
    public long[] distance(int[] nums) {
        long[] res=new long[nums.length];
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.get(nums[i]).add(i);
            }
            else
            {
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
        for(int j:map.keySet())
        {
            ArrayList<Integer> list=map.get(j);
            if(list.size()==1)
            {
                continue;
            }
            ArrayList<Long> temp=new ArrayList<>();
            temp.add((long)list.get(0));
            for(int i1=1;i1<list.size();i1++)
            {
                temp.add((long)list.get(i1)+temp.get(i1-1));
            }
            for(int i1=0;i1<temp.size();i1++)
            {
                if(i1==0)
                {
                    res[list.get(i1)]=(long)(temp.get(temp.size()-1)-temp.get(i1))-(long)((temp.size()-1)*list.get(i1));
                }
                else
                {
                    long left=Math.abs((long)temp.get(i1-1)-((long)i1*list.get(i1)));
                    long right=Math.abs((long)(temp.get(temp.size()-1)-temp.get(i1))-((long)(temp.size()-1-i1)*list.get(i1)));
                    res[list.get(i1)]=left+right;
                }
            }
        }
        return res;
        
    }
}