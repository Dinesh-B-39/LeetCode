class Solution {
    public void check(int n,int ind,int[][] res)
    {
        int y=n;
        int z=0;
        while(n>0)
        {
            z+=(n%10);
            n=n/10;
        }
        res[ind][0]=y;
        res[ind][1]=z;
    }
    public int minSwaps(int[] nums) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        int[][] res=new int[nums.length][2];
        for(int i=0;i<nums.length;i++)
        {
            map1.put(nums[i],i);
            check(nums[i],i,res);
        }
        Arrays.sort(res,(a,b)->{
            if(a[1]==b[1])
            {
                return Integer.compare(a[0],b[0]);
            }
            else
            {
                return Integer.compare(a[1],b[1]);
            }
        });
        int fin=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=res[i][0])
            {
                int ind=map1.get(res[i][0]);
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                map1.put(nums[ind],ind);
                fin+=1;
            }
        }
        return fin;
       

        
    }
}