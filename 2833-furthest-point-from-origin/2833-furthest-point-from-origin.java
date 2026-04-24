class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0;
        int r=0;
        int d=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L')
            {
                l+=1;
            }
            else if(moves.charAt(i)=='R')
            {
                r+=1;
            }
            else
            {
                d+=1;
            }
        }
        return Math.max(Math.abs(l+d-r),Math.abs(r+d-l));
    }
}