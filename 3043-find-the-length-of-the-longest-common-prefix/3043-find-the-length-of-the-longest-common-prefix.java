class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            String s=arr1[i]+"";
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<s.length();j++)
            {
                sb.append(s.charAt(j));
                set.add(sb.toString());
            }
        }
        int maxe=0;
        for(int i=0;i<arr2.length;i++)
        {
            String s=arr2[i]+"";
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<s.length();j++)
            {
                sb.append(s.charAt(j));
                if(set.contains(sb.toString()))
                {
                    maxe=Math.max(maxe,sb.length());
                }
            }

        }
        return maxe;
    }
}