class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] temp=new int[code.length*3];
        for(int i=0;i<code.length;i++)
        {
            temp[i]=code[i];
            temp[i+code.length]=code[i];
            temp[i+code.length+code.length]=code[i];
        }
        for(int i=1;i<temp.length;i++)
        {
            temp[i]+=temp[i-1];
        }
        int p=0;
        for(int i=code.length;i<code.length+code.length;i++)
        {
            if(k==0)
            {
                code[p]=0;
            }
            else if(k<0)
            {
                int z=Math.abs(k);
                code[p]=temp[i-1]-temp[i-(z+1)];
            }
            else
            {
                code[p]=temp[i+k]-temp[i];
            }
            p+=1;
        }
        return code;
    }
}