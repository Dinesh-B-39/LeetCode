class Solution:
    def kidsWithCandies(self, candies: list[int], k: int) -> list[bool]:
        list=[]
        maxe=0
        for i in candies:
            maxe=max(maxe,i)
        for i in candies:
            if i+k>=maxe:
                list.append(True)
            else:
                list.append(False)
        return list
        