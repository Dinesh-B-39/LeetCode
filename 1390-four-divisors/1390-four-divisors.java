class Solution {
    public int sumFourDivisors(int[] nums) {
        int fin=0;
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer> set=new HashSet<>();
            int c=0;
            for(int j=1;j<=Math.sqrt(nums[i]);j++)
            {
                int s1=nums[i]%j;
                if(s1==0)
                {
                    c+=j;
                    set.add(j);
                    int s2=nums[i]/j;
                    if(!set.contains(s2))
                    {
                        c+=s2;
                        set.add(s2);
                    }
                }
                if(set.size()>4)
                {
                    break;
                }

            }
            if(set.size()==4)
            {
                fin+=c;
            }
        }
        return fin;
    }
}