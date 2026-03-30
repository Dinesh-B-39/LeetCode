class Solution {
    public boolean checkStrings(String s1, String s2) {
        char[] odd=new char[26];
        char[] even=new char[26];
        for(int i=0;i<s1.length();i++)
        {
            if(i%2==0)
            {
                even[s1.charAt(i)-'a']+=1;
            }
            else
            {
                odd[s1.charAt(i)-'a']+=1;
            }
        }
        for(int i=0;i<s1.length();i++)
        {
            if(i%2==0)
            {
                if(even[s2.charAt(i)-'a']==0)
                {
                    return false;
                }
                else
                {
                    even[s2.charAt(i)-'a']-=1;
                }
            }
            else 
            {
                if(odd[s2.charAt(i)-'a']==0)
                {
                    return false;
                }
                else
                {
                    odd[s2.charAt(i)-'a']-=1;
                }
            }
        }
        return true;
    }
}