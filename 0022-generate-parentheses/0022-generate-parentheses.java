class Solution {
    List<String> list=new ArrayList<>();
    public void check(int c1,int c2,int n,StringBuilder sb)
    {
        if(sb.length()==n*2)
        {
            list.add(sb.toString());
            return;
        }
        if(c1<n)
        {
            sb.append("(");
            check(c1+1,c2,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(c1>c2)
        {
            sb.append(")");
            check(c1,c2+1,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        check(0,0,n,sb);
        return list;
    }
}