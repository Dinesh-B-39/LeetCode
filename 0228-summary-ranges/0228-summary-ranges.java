class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        if(nums.length==0)
        {
            return res;
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        int ind=-1;
        while(i<nums.length)
        {
            if(sb.length()==0)
            {
                sb.append(nums[i]+"");
                ind=i;
                i+=1;
            }
            else
            {
                if(nums[i]-1==nums[i-1])
                {
                    i+=1;
                }
                else
                {
                    if(i-1==ind)
                    {
                        res.add(sb.toString());
                        sb.setLength(0);
                    }
                    else
                    {
                        sb.append("->"+nums[i-1]);
                        res.add(sb.toString());
                        sb.setLength(0);

                    }
                }
            }
        }
        if(i-1==ind)
        {
             res.add(sb.toString());
        }
        else
        {
            sb.append("->"+nums[i-1]);
            res.add(sb.toString());
        }
        return res;
    }
}