class Pair
{
    int val;
    int ind;
    Pair(int val,int ind)
    {
        this.val=val;
        this.ind=ind;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        Stack<Pair> stack=new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--)
        {
            while(!stack.isEmpty())
            {
                Pair p1=stack.pop();
                if(p1.val>temperatures[i])
                {
                    res[i]=p1.ind-i;
                     Pair p2=new Pair(temperatures[i],i);
                     stack.push(p1);
                    stack.push(p2);
                    break;
                }
            }
            Pair p1=new Pair(temperatures[i],i);
            stack.push(p1);
        }
        return res;
    }
}