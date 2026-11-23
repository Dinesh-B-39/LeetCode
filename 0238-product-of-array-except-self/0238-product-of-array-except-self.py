class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        pref=[]
        suff=[]
        res=[]
        p1=1
        p2=1
        for i in range(0,len(nums)):
            p1*=nums[i]
            pref.append(p1)
            new_ind=len(nums)-1-i
            p2*=nums[new_ind]
            suff.append(p2)
        suff[0:]=suff[::-1]
       
        for i in range(0,len(nums)):
            if i==0:
                res.append(suff[i+1])
            elif i==len(nums)-1:
                res.append(pref[i-1])
            else:
                res.append(pref[i-1]*suff[i+1])
        return res


        