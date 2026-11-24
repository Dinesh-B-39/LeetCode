class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        map=dict()
        for i in range(0,len(nums)):
            if nums[i] not in map:
                map[nums[i]]=1
            else:
                map.update({nums[i]:map.get(nums[i])+1})
        for value in map.values():
            if value>=2:
                return True
        return False
        