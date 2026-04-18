class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer> list=new ArrayList<>();
     
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
        for(int i=0;i<queries.length;i++)
        {
            int ind=queries[i];
            List<Integer> temp=map.get(nums[ind]);
            int low=0;
            int high=temp.size()-1;
            if(low==high)
            {
                queries[i]=-1;
                continue;
            }
            int val=-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(temp.get(mid)==ind)
                {
                    val=mid;
                    break;
                }
                else if(temp.get(mid)<ind)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }

            }
            int mine=Integer.MAX_VALUE;
            if(val==0)
            {
                mine=Math.min(nums.length-temp.get(temp.size()-1)+ind,temp.get(val+1)-temp.get(val));
            }
            else if(val==temp.size()-1)
            {
                int z1=temp.get(val)-temp.get(val-1);
                int z2=nums.length-ind+temp.get(0);
                mine=Math.min(z1,z2);
            }
            else
            {
                mine=Math.min(temp.get(val)-temp.get(val-1),temp.get(val+1)-temp.get(val));
            }
            queries[i]=mine;

        }
        for(int i:queries)
        {
            list.add(i);
        }
        return list;
    }
}