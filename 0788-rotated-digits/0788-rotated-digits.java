class Solution {
    public int rotatedDigits(int n) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(0);
        set.add(8);
        set.add(2);
        set.add(5);
        set.add(6);
        set.add(9);
        int tot=0;
        for(int i=1;i<=n;i++)
        {
            if(i<10 && set.contains(i) && i!=1 && i!=8)
            {
                tot+=1;
            }
            else
            {
                boolean flag=true;
                int p=0;
                int k=i;
                while(k>0)
                {
                    int z=k%10;
                    if(!set.contains(z))
                    {
                        flag=false;
                        break;
                    }
                    else if(set.contains(z) && z!=0 && z!=1 && z!=8)
                    {
                        p+=1;
                    }
                    k=k/10;
                }
                if(p>0 && flag)
                {
                    tot+=1;
                }

            }
        }
        return tot;
    }
}