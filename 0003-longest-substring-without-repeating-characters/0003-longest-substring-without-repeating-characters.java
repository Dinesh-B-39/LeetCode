class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxe=0;
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int j=0;
    
        while(j<s.length())
        {
            while(set.contains(s.charAt(j)))
            {
                set.remove(s.charAt(i));
                i+=1;
            }
            set.add(s.charAt(j));
            maxe=Math.max(j-i+1,maxe);
            j+=1;
        }
        return maxe;
    }
}