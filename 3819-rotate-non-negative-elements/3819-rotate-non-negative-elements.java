class Solution {
    public int[] rotateElements(int[] nums, int k) {
        // if(k%2==0)
        // {
        //     return nums;
        // }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                list.add(nums[i]);
            }
        }
        if(list.size()==0)
        {
            return nums;
        }
        int[] res=new int[list.size()];
        k=k%list.size();
        // System.out.println(k)
         int j1=k-1;
        for(int i=res.length-1;i>=res.length-k;i--)
        {
            res[i]=list.get(j1);
            j1-=1;
        }
        int p1=0;
        for(int i=k;i<res.length;i++)
        {
            res[p1]=list.get(i);
            p1+=1;
        }
      
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                nums[i]=res[j];
                j+=1;
            }
        }
        return nums;
    }
}