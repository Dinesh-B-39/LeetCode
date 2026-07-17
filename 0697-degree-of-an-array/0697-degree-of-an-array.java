class Solution {
    public int check(int[] nums,int val)
    {
          
        int st=-1;
        int end=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                st=i;
                break;
            }
        }
        for(int j=nums.length-1;j>=0;j--)
        {
            if(nums[j]==val)
            {
                end=j;
                break;
            }
        }
        return end-st+1;

    }
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxe=Integer.MIN_VALUE;
       
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            int p=map.get(nums[i]);
            if(p>maxe)
            {
                maxe=p;
               
            }
        }
        // System.out.println(maxe+":"+val);
        if(maxe==1)
        {
            return 1;
        }
        int mine=Integer.MAX_VALUE;
        for(int i:map.keySet())
        {
            if(map.get(i)==maxe)
            {
                mine=Math.min(mine,check(nums,i));
            }
        }
        return mine;
        
    }
}