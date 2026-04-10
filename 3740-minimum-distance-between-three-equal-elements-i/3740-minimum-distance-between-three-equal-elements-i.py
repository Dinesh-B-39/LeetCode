class Solution:
    def minimumDistance(self, nums: List[int]) -> int:
        mine=float('inf')
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                for k in range(j+1,len(nums)):
                    if nums[i]==nums[j] and nums[j]==nums[k]:
                        s1=abs(i-j)+abs(j-k)+abs(k-i);
                        mine=min(mine,s1);
        if mine==float('inf'):
            return -1;
        return mine;

        