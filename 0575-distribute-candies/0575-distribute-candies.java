class Solution {
    public int distributeCandies(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        return Math.min(set.size(),nums.length/2);
    }
}