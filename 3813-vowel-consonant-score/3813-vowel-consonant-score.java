class Solution {
    public int vowelConsonantScore(String s) {
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
        set.add(' ');
        int c=0;
        int v=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                v+=1;
            }
            else if(!set.contains(s.charAt(i)))
            {
                c+=1;
            }
        }
        if(c==0)
        {
             return 0;
        }
       
        return (int)Math.floor(v/c);
    }
}