class Solution(object):
    def twoSum(self, nums, target):
        map=dict()
        res=[]
        for i in range(0,len(nums)):
            map[nums[i]]=i
        for i in range(0,len(nums)):
            z=target-nums[i]
            if z in map and map.get(z)!=i:
                res.append(i)
                res.append(map.get(z))
                return res




        