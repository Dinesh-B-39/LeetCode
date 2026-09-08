class Solution {
    public int totalFruit(int[] nums) {
    
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxe=0;
        int i=0;
        int j=0;
        while(j<nums.length)
        {
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>2)
            {
                int y=map.get(nums[i]);
                if(y==1)
                {
                    map.remove(nums[i]);
                }
                else
                {
                    map.put(nums[i],y-1);
                }
                
                i+=1;
            }
            maxe=Math.max(maxe,j-i+1);
            j+=1;
        }
        return maxe;
    }
}