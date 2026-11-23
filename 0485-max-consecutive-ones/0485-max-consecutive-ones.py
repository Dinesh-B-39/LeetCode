class Solution:
    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:
        maxe=0
        c=0
        for i in nums:
            if i==1:
                c+=1
            else:
                maxe=max(maxe,c)
                c=0
        maxe=max(maxe,c)
        return maxe

        