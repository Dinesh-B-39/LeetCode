class Solution:
    def canAliceWin(self, n: int) -> bool:
        x=10
        turn="Alice"
        while(n>=0):
            if n<x:
                if turn=="Alice":
                    return False
                else:
                    return True
            else:
                n-=x
                x-=1
                if turn=="Alice":
                    turn="Bob"
                else:
                    turn="Alice"


        