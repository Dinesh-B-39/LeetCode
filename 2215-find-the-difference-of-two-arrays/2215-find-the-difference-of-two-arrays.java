class Solution {
    public List<Integer> check(int[] num1,int[] num2)
    {
        int l=0;
        int r=0;
        List<Integer> list=new ArrayList<>();
        while(l<num1.length && r<num2.length)
        {
            if(l>0 && num1[l]==num1[l-1])
            {
                l+=1;

            }
            else if(num1[l]<num2[r])
            {
                list.add(num1[l]);
                l+=1;
            }
            else if(num1[l]>num2[r])
            {
                r+=1;
            }
            else
            {
                l+=1;
              
            }
        }
        while(l<num1.length)
        {
            if(l>0 && num1[l]==num1[l-1])
            {
                l+=1;

            }
            else
            {
                list.add(num1[l]);
                l+=1;
            }
            
        }
        return list;
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<List<Integer>> res=new ArrayList<>();
        res.add(check(nums1,nums2));
        res.add(check(nums2,nums1));
        return res;
        
    }
}