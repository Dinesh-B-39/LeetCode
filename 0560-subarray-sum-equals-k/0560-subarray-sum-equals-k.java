class Solution {
    public int subarraySum(int[] nums, int k) {
        int pref=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            pref+=nums[i];
           
                int z=pref-k;
                if(map.containsKey(z))
                {
                    res+=map.get(z);
                }
            
            map.put(pref,map.getOrDefault(pref,0)+1);
        }
        return res;
    }
}