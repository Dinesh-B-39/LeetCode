class Solution:
    def findNumbers(self, nums: list[int]) -> int:
        c=0
        for i in nums:
            s=str(i)
            if(len(s)%2==0):
                c+=1
        return c
        