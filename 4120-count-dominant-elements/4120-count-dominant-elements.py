class Solution:
    def countDominantElements(self, nums: list[int]) -> int:
        count=0
        for i in range(0,len(nums)):
            if i==0 and i==len(nums)-1:
                count+=1
            elif i==0:
                if nums[i]>=nums[i+1]:
                    count+=1

            elif i==len(nums)-1:
                if(nums[i]>=nums[i-1]):
                    count+=1
            else:
                z=float(nums[i])
                k=(nums[i-1]+nums[i+1])/2
                if z>=k:
                    count+=1
        return count
        