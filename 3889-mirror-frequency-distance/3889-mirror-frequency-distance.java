class Solution {
    public int mirrorFrequency(String s) {
        HashSet<Character> set=new HashSet<>();
        set.add('0');
        set.add('1');
        set.add('2');
        set.add('3');
        set.add('4');
        set.add('5');
        set.add('6');
        set.add('7');
        set.add('8');
        set.add('9');
        int c=0;
        int[] cha=new int[26];
        int[] num=new int[10];
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                cha[s.charAt(i)-'a']+=1;
            }
            else
            {
                num[s.charAt(i)-'0']+=1;
            }
        }
        int z=0;
        int i=0;
        int j=25;
        while(i<j)
        {
            z+=Math.abs(cha[i]-cha[j]);
            i+=1;
            j-=1;
        }
        i=0;
        j=9;
        while(i<j)
        {
            z+=Math.abs(num[i]-num[j]);
            i+=1;
            j-=1;
        }
        return z;
        
    }
}