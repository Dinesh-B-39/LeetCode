class Solution {
    public int robotSim(int[] commands, int[][] obs) {
       int maxe=0;
       HashSet<String> set=new HashSet<>();
    for(int i=0;i<obs.length;i++)
    {
        set.add(obs[i][0]+" "+obs[i][1]);
    }
    char[] arr=new char[4];
    arr[0]='W';
    arr[1]='N';
    arr[2]='E';
    arr[3]='S';
    int curInd=1;
    char curChar='N';
    int i1=0;
    int j1=0;
    for(int i=0;i<commands.length;i++)
    {
        if(commands[i]<0)
        {
            if(commands[i]==-1)
            {
                int pInd=(curInd+1)%4;
                curChar=arr[pInd];
                curInd=pInd;
            }
            else
            {
                int pInd=curInd-1;
                if(pInd<0)
                {
                    pInd=pInd+4;
                    
                }
                 curChar=arr[pInd];
                curInd=pInd;
            }
        }
        else
        {
            if(curChar=='N')
            {
                for(int j=1;j<=commands[i];j++)
                {
                    j1+=1;
                    if(set.contains(i1+" "+j1))
                    {
                        j1-=1;
                        break;
                    }
                }
            }
            else if(curChar=='E')
            {
                for(int j=1;j<=commands[i];j++)
                {
                    i1+=1;
                    if(set.contains(i1+" "+j1))
                    {
                        i1-=1;
                        break;
                    }
                }
            }
            else if(curChar=='S')
            {
                for(int j=1;j<=commands[i];j++)
                {
                    j1-=1;
                    if(set.contains(i1+" "+j1))
                    {
                        j1+=1;
                        break;
                    }
                }
            }
            else if(curChar=='W')
            {
                for(int j=1;j<=commands[i];j++)
                {
                    i1-=1;
                    if(set.contains(i1+" "+j1))
                    {
                        i1+=1;
                        break;
                    }
                }
            }
            maxe=Math.max(maxe,((i1*i1)+(j1*j1)));
        }
    }
    return maxe;
    }
}