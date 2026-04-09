class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        map.put(0,1);
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c+=nums[i];
            if(map.containsKey(c-k))
            {
                res+=map.get(c-k);
            }
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return res;
    }
}