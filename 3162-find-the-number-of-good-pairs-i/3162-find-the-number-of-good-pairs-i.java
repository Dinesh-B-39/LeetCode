class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int c=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if((nums1[i]%(nums2[j]*k))==0)
                {
                    System.out.print(i+" "+j);
                    System.out.println();
                    c+=1;
                }
                
            }
        }
        return c;
    }
}