class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int st=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push('(');
            }
            else
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                sb.append(s.substring(st+1,i));
                st=i+1;
            }

        }
        return sb.toString();
    }
}