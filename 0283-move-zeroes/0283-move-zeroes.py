class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        zeros_count=0
        res=[]
        for i in nums:
            if i==0:
                zeros_count+=1
            else:
                res.append(i)
        for i in range(0,zeros_count):
            res.append(0)
        nums[:]=res
        