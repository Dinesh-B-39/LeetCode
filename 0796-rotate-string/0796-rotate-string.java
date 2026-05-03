class Solution {
    public boolean rotateString(String s, String goal) {
        String s1=s;
        if(s.equals(goal))
        {
            return true;
        }
        for(int i=1;i<s.length();i++)
        {
            if((s.substring(i)+s.substring(0,i)).equals(goal))
            {
                return true;
            }
        }
        return false;
    }
}