class Solution {
    public boolean checkOnesSegment(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1' && c==-1)
            {
                return false;
            }
            else if(s.charAt(i)=='1')
            {
                c+=1;
            }
            else
            {
                c=-1;
            }
        }
        return true;
    }
}