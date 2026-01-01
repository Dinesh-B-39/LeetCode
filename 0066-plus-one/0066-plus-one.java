class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int j=0;
        int p=0;
        if(digits[n-1]<9)
        {
            digits[n-1]+=1;
        }
        else
        {
            p=1;

            if(n>=2)
            {
                j=n-2;
                digits[n-1]=0;
                while(j>=0 && p>0 )
                {
                    p+=digits[j];
                    digits[j]=p%10;
                    
                    p=p/10;
                    j--;
                }
            }
            else
            {
                int[] fin=new int[2];
                fin[0]=1;
                fin[1]=0;
                return fin;
            }
        
        }
        if(p!=0)
        {
            
        ArrayList<Integer> list=new ArrayList<>();
        while(p!=0)
        {
            list.add(p%10);
            System.out.println(list.get(0));
            p=p/10;
        }
        int[] res=new int[n+list.size()];
        
        for(int j1=0;j1<list.size();j1++)
        {
            res[j1]=list.get(list.size()-j1-1);
        }
        int j1=list.size();
        for(int i=0;i<digits.length;i++)
        {
            res[j1]=digits[i];
            j1+=1;
        }
        return res;
        }
      return digits;


        
    }
}