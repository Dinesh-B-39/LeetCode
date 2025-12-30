class Solution {
    public List<String> res=new ArrayList<>();
    public void check(int n,int c1,int c2,StringBuilder sb)
    {
        if(sb.length()==2*n)
        {
            String p=sb.toString();
            if(!res.contains(p))
            {
                res.add(p);
            }
            
            return;
        }
        if(c1<n )
        {
            sb.append("(");
            c1+=1;
            check(n,c1,c2,sb);
            c1-=1;
            sb.deleteCharAt(sb.length()-1);
        }
        if(c1>c2 && c2<n)
        {
            sb.append(")");
            c2+=1;
            check(n,c1,c2,sb);
            c2-=1;
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {

        StringBuilder sb=new StringBuilder();
        check(n,0,0,sb);
        return res;
        
    }
}