class Solution {
    public boolean canBeEqual(String s1, String s2) {
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i) || (i+2<s1.length() && s1.charAt(i)==s2.charAt(i+2)) || (i-2>=0 && s1.charAt(i)==s2.charAt(i-2)))
            {
                continue;
            }
            else
            {
                return false;
            }
        }

        return true;
    }
}