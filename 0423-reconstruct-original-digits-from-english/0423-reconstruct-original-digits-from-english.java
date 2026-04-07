class Solution {
    public void check(char[] arr,String s,int ind)
    {
        for(int i=0;i<ind;i++)
        {
            arr[s.charAt(i)-'a']+=1;
        }
    }
    public String originalDigits(String s) {
        char[] arr=new char[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']+=1;
        }
        StringBuilder sb=new StringBuilder();
        String[] seq=new String[10];
        seq[0]="zero";
        seq[1]="two";
        seq[2]="four";
        seq[3]="six";
        seq[4]="eight";
        seq[5]="one";
        seq[6]="three";
        seq[7]="five";
        seq[8]="seven";
        seq[9]="nine";
        ArrayList<Integer> list=new ArrayList<>();
        int[] num=new int[10];
        num[0]=0;
        num[1]=2;
        num[2]=4;
        num[3]=6;
        num[4]=8;
        num[5]=1;
        num[6]=3;
        num[7]=5;
        num[8]=7;
        num[9]=9;
        int i=0;
        while(i<seq.length)
        {
            String s1=seq[i];
            boolean flag=true;
            for(int j=0;j<s1.length();j++)
            {
                if(arr[s1.charAt(j)-'a']==0)
                {
                    check(arr,s1,j);
                    flag=false;
                    i+=1;
                    break;
                }
                else
                {
                    arr[s1.charAt(j)-'a']-=1;
                }
            }
            if(flag)
            {
                list.add(num[i]);
            }
        }
        Collections.sort(list);
        for(int i1=0;i1<list.size();i1++)
        {
            sb.append(list.get(i1));
        }
        return sb.toString();
    }
}