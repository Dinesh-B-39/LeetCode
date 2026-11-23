class Solution:
    def checkString(self, s: str) -> bool:
        j=len(s)-1
        while(j>=0 and s[j]=='b'):
            j-=1;
        if j<0:
            return True
        j-=1
        while(j>=0):
            if s[j]=='b':
                return False
            else:
                j-=1

        return True


        
        