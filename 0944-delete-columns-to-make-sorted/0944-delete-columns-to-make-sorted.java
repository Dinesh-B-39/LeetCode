class Solution {
    public boolean check(char[] temp,char[] comp)
    {
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]!=comp[i])
            {
                return true;
            }
        }
        return false;
    }
    public int minDeletionSize(String[] strs) {
        int c=0;
        for(int i=0;i<strs[0].length();i++)
        {
            char[] temp=new char[strs.length];
            char[] comp=new char[strs.length];
            for(int j=0;j<strs.length;j++)
            {
                temp[j]=strs[j].charAt(i);
                comp[j]=temp[j];
            }
            Arrays.sort(comp);
            if(check(temp,comp))
            {
                c+=1;
            }
        }
        return c;

    }
}