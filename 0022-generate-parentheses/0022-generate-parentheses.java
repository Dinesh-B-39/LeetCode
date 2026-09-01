class Solution {
    List<String> res=new ArrayList<>();
    public void check(int n,int s1,int s2,StringBuilder sb)
    {
        if(s1==n && s2==n)
        {
            res.add(sb.toString());
            return;
        }
        if(s1<n)
        {
            sb.append("(");
            check(n,s1+1,s2,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(s2<n && s1>s2)
        {
            sb.append(")");
            check(n,s1,s2+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        check(n,0,0,sb);
        return res;
        
    }
}