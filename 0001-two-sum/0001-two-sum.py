class Solution(object):
    def twoSum(self, nums, target):
        map=dict()
        arr=list()
        for i in range(0,len(nums)):
            map[nums[i]]=i
        for i in range(0,len(nums)):
            z=target-nums[i]
            if z in map and map.get(z)!=i:
                arr.append(i)
                arr.append(map.get(z))
                return arr
    
    
        