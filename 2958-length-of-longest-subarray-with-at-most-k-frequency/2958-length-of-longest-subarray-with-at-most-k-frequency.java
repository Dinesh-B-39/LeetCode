class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int maxe=Integer.MIN_VALUE;
        while(j<nums.length)
        {
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.get(nums[j])>k)
            {
              
                    map.put(nums[i],map.get(nums[i])-1);
                    i+=1;
              
            }
            maxe=Math.max(maxe,j-i+1);
            j+=1;
        }
       return maxe; 
    }
}