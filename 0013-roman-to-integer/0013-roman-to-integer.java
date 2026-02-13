class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int z=0;
        z+=map.get(s.charAt(s.length()-1));
        for(int j=s.length()-2;j>=0;j--)
        {
            int cur=map.get(s.charAt(j));
            int nex=map.get(s.charAt(j+1));
            if(cur<nex)
            {
                z-=cur;
            }
            else
            {
                z+=cur;
            }
        }
        return z;
    }
}