class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int c1=0;
        int c2=0;
        int st1Index=startIndex;
        int st2Index=startIndex;
        while(true)
        {
            if(st1Index==startIndex && c1>0)
            {
                c1=-1;
                break;
            }
            else if(words[st1Index].equals(target))
            {
                break;
            }
            else
            {
                c1+=1;
                st1Index=(st1Index+1)%words.length;
            }
        }
        while(true)
        {
            if(st2Index==startIndex && c2>0)
            {
                c2=-1;
                break;
            }
            else if(words[st2Index].equals(target))
            {
                break;
            }
            else
            {
                c2+=1;
                st2Index-=1;
                if(st2Index<0)
                {
                    st2Index=words.length-1;
                }
            }
        }
       
        return Math.min(c1,c2);
    }
}