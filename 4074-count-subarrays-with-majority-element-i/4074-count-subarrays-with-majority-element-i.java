class Solution {
    public boolean check(HashMap<Integer,Integer> map,int size,int target)
    {
        if(map.containsKey(target) && map.get(target)>(size/2))
        {
            return true;
        }
        return false;
    }
    public int countMajoritySubarrays(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i;j<nums.length;j++)
            {
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if(check(map,j-i+1,target))
                {
                    c+=1;
                }

            }
        }
        return c;
        
    }
}