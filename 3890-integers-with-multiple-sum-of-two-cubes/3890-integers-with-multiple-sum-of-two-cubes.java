class Solution {
    public List<Integer> findGoodIntegers(int n) {
        List<Integer> res=new ArrayList<>();
        HashMap<Long,Integer> map=new HashMap<>();
        
        for(int i=1;i<Math.cbrt(n);i++)
        {
            long z1=i*i*i;
            for(int j=i;j<Math.cbrt(n);j++)
            {
                long z2=j*j*j;
                long val=z1+z2;
                
                if(val<=n)
                {
                    map.put(val,map.getOrDefault(val,0)+1);               
                }
                else
                {
                    break;
                }
            }
        }
        for(long i:map.keySet())
        {
            if(i>0 && map.get(i)>=2)
            {
                res.add((int)i);
            }
        }
        Collections.sort(res);

        return res;
    }
}