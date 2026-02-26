class Solution {
    public int numSteps(String s) {
        StringBuilder sb=new StringBuilder(s);
       
        int c=0;
        while(!sb.toString().equals("1"))
        {
            if(sb.charAt(sb.length()-1)=='0')
            {
                sb.deleteCharAt(sb.length()-1);
                 
            }
            else
            {
                int flag=1;
                for(int i=sb.length()-1;i>=0;i--)
                {
                    if(sb.charAt(i)=='1')
                    {
                        sb.setCharAt(i,'0');
                    }
                    else
                    {
                        sb.setCharAt(i,'1');
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                {
                    sb.insert(0,1);
                }
                 
            }
            c+=1;
        }

        return c;
    }
}