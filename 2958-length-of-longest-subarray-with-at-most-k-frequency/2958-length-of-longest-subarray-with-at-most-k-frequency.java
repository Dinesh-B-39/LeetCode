class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int maxe=-1;
        while(j<nums.length)
        {
            // temp[nums[j]]+=1;
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.get(nums[j])>k)
            {
                int y=map.get(nums[i]);
               map.put(nums[i],y-1);
               if(y==1)
               {
                map.remove(nums[i]);
               }
                i+=1;
            }
            maxe=Math.max(maxe,j-i+1);
            j+=1;
        }
        return maxe;
    }
}