class Solution {
    public int totalFruit(int[] nums) {
        int i=0;
        int j=0;
        int maxe=Integer.MIN_VALUE;
        // HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<nums.length)
        {
            // set.add(nums[j]);
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>2)
            {
                int l=map.get(nums[i]);
                if(l-1==0)
                {
                    map.remove(nums[i]);
                    i+=1;
                    break;
                }
                map.put(nums[i],l-1);
                i+=1;
            }
            maxe=Math.max(maxe,j-i+1);
            j+=1;

        }
        return maxe;
    }
}