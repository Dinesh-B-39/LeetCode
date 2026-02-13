class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"I");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(1000,"M");
        map.put(900,"CM");
        int[] temp=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder sb=new StringBuilder();
            for(int i=0;i<temp.length;i++)
            {
                if(num==0)
                {
                    break;
                }
                if(temp[i]<=num)
                {
                    int lim=num/temp[i];
                    String str=map.get(temp[i]);
                    for(int j=0;j<lim;j++)
                    {
                        sb.append(str);
                    }
                    num=num%temp[i];
                }
            }
        return sb.toString();
    }
}