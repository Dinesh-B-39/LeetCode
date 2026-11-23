class Solution:
    def runningSum(self, nums: list[int]) -> list[int]:
        res=[]
        s=0
        for i in nums:
            s+=i
            res.append(s)
        return res

        