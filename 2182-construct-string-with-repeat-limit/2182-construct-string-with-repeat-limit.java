class Solution {
    public String repeatLimitedString(String s, int limit) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']+=1;
        }
        int z=0;
        int c=0;
        int p=0;

        StringBuilder sb=new StringBuilder();
        while(p!=-1)
        {
            int i=25;
            boolean flag=false;
            while(i>=0)
            {
                if(arr[i]!=0 && sb.length()>=1 && sb.charAt(sb.length()-1)!=(char)(i+97))
                {
                    z=0;
                }
                if(arr[i]==0)
                {
                    i-=1;
                    continue;
                }
                if(c==0)
                {
                    sb.append((char)(i+97));
                    flag=true;
                    arr[i]-=1;
                    z=1;
                    c=1;
                    continue;
                }
                else if((char)(i+97)==sb.charAt(sb.length()-1))
                {
                    if(z==limit)
                    {
                        i-=1;
                       
                        continue;
                    }
                    else
                    {
                        sb.append((char)(i+97));
                        flag=true;
                        arr[i]-=1;
                        z+=1;
                        c+=1;
                        
                    }
                }
                else
                {
                    sb.append((char)(i+97));
                    flag=true;
                    z=1;
                    c+=1;
                    arr[i]-=1;
                    break;
                }

            }
            if(!flag)
            {
                p=-1;
                break;
            }
        }
        return sb.toString();
    }
}