class Solution {
    public boolean hasSameDigits(String s) {
        
        StringBuilder s1=new StringBuilder(s);
        StringBuilder peek=new StringBuilder(s);
        while(peek.length()>2)
        {
            s1=new StringBuilder();
            s1.append(peek);
            peek=new StringBuilder();
            for(int i=0;i<s1.length()-1;i++)
            {
                int val=(s1.charAt(i)-'0'+s1.charAt(i+1)-'0')%10;
                peek.append(val+"");
            }
           
        }
        return peek.charAt(0)==peek.charAt(1);
    }
}