class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map={}
        for i in range(len(nums)):
            map[nums[i]]=i
        res=[];
        for i in range(len(nums)):
            k=target-nums[i]
            if k in map:
                if i!=map.get(k):
                    res.append(i)
                    res.append(map.get(k))
                    break;
        return res;
        