class Solution {
    ArrayList<String> list=new ArrayList<>();
    public void check(int n1,int n2,StringBuilder sb,int c1,int c2)
    {
        if(n1==0 && n2==0)
        {
            list.add(sb.toString());
            return;
        }
        if(n1>0)
        {
            sb.append("(");
            check(n1-1,n2,sb,c1+1,c2);
            sb.deleteCharAt(sb.length()-1);
        }
        if(n2>0 && c1>c2)
        {
            sb.append(")");
            check(n1,n2-1,sb,c1,c2+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        check(n,n,sb,0,0);
        return list;
        
    }
}