class Solution {
    public StringBuilder invert(StringBuilder con)
    {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<con.length();i++)
        {
            if(con.charAt(i)=='1')
            {
                res.append("0");
            }
            else
            {
                res.append("1");
            }
        }
        return res;
    }
    public char findKthBit(int n, int k) {
        StringBuilder con=new StringBuilder("0");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(con.toString());
            StringBuilder s1=invert(con);
            // System.out.println(s1.toString());
            sb.append("1");
            sb.append(s1.reverse());
            con=new StringBuilder();
            con.append(sb.toString());
            sb=new StringBuilder();
            // System.out.println(con.toString());
        }
        return con.charAt(k-1);
    }
}