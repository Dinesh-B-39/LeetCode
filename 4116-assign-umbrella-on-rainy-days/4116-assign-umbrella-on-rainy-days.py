class Solution:
    def assignUmbrella(self, rain: list[int]) -> list[str]:
        alice=0
        bob=0
        res=[]
        for i in range(0,len(rain)):
            if i==len(rain)-1:
                if rain[i]==0:
                    res.append("None")
                else:
                    res.append("Bob")
            elif rain[i]==0:
                res.append("None")
            elif rain[i]==1 and rain[i+1]==1:
                if alice<=bob:
                    alice+=1
                    res.append("Alice")
                else:
                    bob+=1
                    res.append("Bob")
            else:
                bob+=1
                res.append("Bob")
        return res