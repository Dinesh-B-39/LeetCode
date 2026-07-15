class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s1="123456789";
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(true)
        {
            if(i==s1.length())
            {
                break;
            }
            if(j<s1.length())
            {

            
            String s=s1.substring(i,j+1);
            int a=Integer.parseInt(s);
          
            if(a>=low && a<=high)
            {
                list.add(a);
                j+=1;
            }
            else
            {
                j=j+1;
            }
            }
            else
            {
                i+=1;
                j=i+1;

            }

        }
        Collections.sort(list);
        return list;
        
    }
}