class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            boolean flag=true;
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].length()>=i+1 && strs[j].charAt(i)==s.charAt(i))
                {
                    continue;
                }
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                sb.append(s.charAt(i));
            }
            else
            {
                break;
            }
        }
        return sb.toString();
    }
}