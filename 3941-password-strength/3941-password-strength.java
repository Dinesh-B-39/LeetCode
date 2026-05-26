class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set=new HashSet<>();
        int c=0;
        for(int i=0;i<password.length();i++)
        {
            if(!set.contains(password.charAt(i)))
            {
                int n1=(int)password.charAt(i);
                if(n1>=48 && n1<=57)
                {
                    c+=3;
                }
                else if(n1>=97)
                {
                    c+=1;
                }
                else if(n1>=65)
                {
                    c+=2;
                }
                else
                {
                    c+=5;
                }
                set.add(password.charAt(i));
            }
        }
        // System.out.println((int)'a');
        return c;
        
    }
}