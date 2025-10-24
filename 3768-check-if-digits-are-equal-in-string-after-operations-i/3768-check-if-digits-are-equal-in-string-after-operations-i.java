class Solution {
    public boolean hasSameDigits(String s) {
        int m=s.length();
        StringBuilder s1=new StringBuilder(s);
        StringBuilder peek=new StringBuilder(s);
        while(m>2)
        {
            s1=new StringBuilder();
            s1.append(peek);
            peek=new StringBuilder();
            for(int i=0;i<s1.length()-1;i++)
            {
                int val=(Integer.parseInt(s1.charAt(i)+"")+Integer.parseInt(s1.charAt(i+1)+""))%10;
                peek.append(val+"");
            }
            m=peek.length();
        }
        return peek.charAt(0)==peek.charAt(1);
    }
}