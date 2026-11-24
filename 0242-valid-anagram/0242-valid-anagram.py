class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        map1=dict()
        map2=dict()
        for i in range(0,len(s)):
            if s[i] not in map1:
                map1[s[i]]=1
            else:
                map1.update({s[i]:map1.get(s[i])+1})
        for i in range(0,len(t)):
            if t[i] not in map2:
                map2[t[i]]=1
            else:
                map2.update({t[i]:map2.get(t[i])+1})
        if len(map1)!=len(map2):
            return False
        for i in map1.keys():
            if map1.get(i)!=map2.get(i):
                return False
        return True
        