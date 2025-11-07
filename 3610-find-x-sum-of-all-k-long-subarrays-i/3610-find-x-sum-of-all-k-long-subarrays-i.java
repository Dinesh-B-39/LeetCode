class Solution {
    public int sub_value(HashMap<Integer,Integer> map,int x)
    {
        ArrayList<int[]> list=new ArrayList<>();
        for(int i:map.keySet())
        {
           
                list.add(new int[]{i,map.get(i)});
        }
        Collections.sort(list,(a,b)->
        {
            if(a[1]==b[1])
            {
                return Integer.compare(b[0],a[0]);
            }
            return Integer.compare(b[1],a[1]);
        });
        int z=0;
        if(list.size()<x)
        {
            for(int i=0;i<list.size();i++)
            {
                z+=list.get(i)[0]*list.get(i)[1];
            }
            return z;
        }
        for(int i=0;i<x;i++)
        {
            z+=list.get(i)[0]*list.get(i)[1];
        }
        return z;
    }
    public int[] findXSum(int[] nums, int k, int x) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res=new int[nums.length-k+1];
        for(int i=0;i<k;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int j=0;
        res[j]=sub_value(map,x);
        j+=1;
        for(int i=k;i<nums.length;i++)
        {
            map.put(nums[i-k],map.get(nums[i-k])-1);
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
            res[j]=sub_value(map,x);
            j+=1;
        }
        return res;
        
    }
}