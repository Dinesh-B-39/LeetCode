class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    public int check2(int k)
    {
        int z=0;
        while(k>0)
        {
            int p=k%10;
            z=(z*10)+p;
            list.add(z);
            k=k/10;
        }
        return z;
    }
    
    public int check1(int k)
    {
        int y=0;
        int z=0;
        int t=10;
        while(k>0)
        {
            int p=k%10;
            y=(y*10)+p;
            if(z==0)
            {
                list.add(p);
                z=p;
            }
            else
            {
                z=(p*t)+z;
                list.add(z);
                t=t*10;
            }
            k=k/10;
        }
        return y;

    }

    public boolean checkPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        if(n<2 || n%2==0)
        {
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public boolean completePrime(int num) {
        // if(num==3137)
        // {
        //     return true;
        // }
        list.clear();
        int p=check1(num);
        System.out.println("p :"+p);
        p=check2(p);
        System.out.println(list);
         for(int i=0;i<list.size();i++)
        {
         
            if(!checkPrime(list.get(i)))
            {
                System.out.println("False "+list.get(i));
                return false;
            }
        }
        return true;
    }
}