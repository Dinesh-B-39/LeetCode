class Solution:
    def maxArea(self, height: list[int]) -> int:
        i=0
        j=len(height)-1
        maxe=0;
        while(i<j):
            p=j-i
            m=min(height[i],height[j])
            maxe=max(maxe,m*p)
            if height[i]<=height[j]:
                i+=1
            else:
                j-=1
        return maxe

        