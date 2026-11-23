class Solution:
    def removeElement(self, nums: list[int], val: int) -> int:
        k=len(nums)-1
        while(k>=0 and nums[k]==val):
            k-=1;
        i=0
        while(i<k):
            if nums[i]==val:
                temp=nums[i]
                nums[i]=nums[k]
                nums[k]=temp
                i+=1
                while(k>=0 and nums[k]==val):
                    k-=1;
            else:
                i+=1
        return k+1
        