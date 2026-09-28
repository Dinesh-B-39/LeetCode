class Solution {
    public int maxDepth(String s) {
        int maxe=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push('(');
                 maxe=Math.max(maxe,stack.size());
            }
            else if(s.charAt(i)==')')
            {
                stack.pop();
            }
           
        }

        return maxe;
    }
}