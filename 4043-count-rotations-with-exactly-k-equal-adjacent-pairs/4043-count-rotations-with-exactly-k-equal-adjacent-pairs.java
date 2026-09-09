class Solution {
    public int check(String s)
    {
        int c=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                c+=1;
            }
        }
        return c;
    }
    public int countRotations(String s, int k) {
        int c=0;
        int m=check(s);
        if(m==k)
        {
            c+=1;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        int z=0;
        while(z<s.length()-1)
        {
            char ch=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch+"");
             m=check(sb.toString());
            if(m==k)
            {
             c+=1;
            }
            z+=1;

        }

        return c;
    }
}