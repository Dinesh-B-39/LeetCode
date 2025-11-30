class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[10001];
        for(int i=0;i<nums2.length-1;i++)
        {
            for(int j=i+1;j<nums2.length;j++)
            {
                if(nums2[j]>nums2[i])
                {
                    res[nums2[i]]=nums2[j];
                    break;
                }
            }
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=res[nums1[i]]==0?-1:res[nums1[i]];
        }
        return nums1;
    }
}