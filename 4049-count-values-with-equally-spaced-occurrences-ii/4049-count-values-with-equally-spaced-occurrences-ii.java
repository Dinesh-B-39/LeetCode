class Solution {
    public int countSpecialIntegers(int[] nums) {
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
        int res=0;
        for(int i:map.keySet())
        {
            ArrayList<Integer> l1=map.get(i);
            int x=-1;
            boolean flag=true;
            if(l1.size()<3)
            {
                flag=false;
                continue;
            }
            
            for(int i1=1;i1<l1.size();i1++)
            {
                if(x==-1)
                {
                    x=l1.get(i1)-l1.get(i1-1);
                }
                else
                {
                    if(l1.get(i1)-l1.get(i1-1)!=x)
                    {
                        flag=false;
                        break;
                    }
                }
            }

            if(flag)
            {
                res+=1;
            }
        }
        return res;
        
    }
}