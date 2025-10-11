class Solution {
    public boolean backspaceCompare(String s, String t) {
        // if(s.charAt(0)=='#' ||s.charAt(0)=='#'  )
        // {
        //     return false;
        // }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                if(!stack.isEmpty())
                {
                     stack.pop();
                }
                
                
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='#')
            {
                if(!stack2.isEmpty())
                {
                    stack2.pop();
                }

                
              
               
            }
            else
            {
                stack2.push(t.charAt(i));
            }
        }
        if(stack.size()!=stack2.size())
        {
            return false;
        }
        while(!stack.isEmpty())
        {
            if(stack.peek()!=stack2.peek())
            {
                return false;
            }
            stack.pop();
            stack2.pop();
        }
        return true;
    }
}