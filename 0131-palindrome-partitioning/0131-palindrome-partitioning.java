class Solution {
    List<List<String>> res=new ArrayList<>();
    public boolean isPalindrome(String s,int i,int j)
    {
        
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }
    public void check(int i,int j,String s,ArrayList<String> list)
    {
        if(j==s.length()-1)
        {
            if(isPalindrome(s,i,j))
            {
                list.add(s.substring(i,j+1));
                res.add(new ArrayList<>(list));
                list.remove(list.size()-1);
            }
            return;
        }
        if(isPalindrome(s,i,j))
        {
            list.add(s.substring(i,j+1));
            check(j+1,j+1,s,list);
            list.remove(list.size()-1);
        }
        check(i,j+1,s,list);
    }
    public List<List<String>> partition(String s) {
        ArrayList<String> list=new ArrayList<>();
        check(0,0,s,list);
        return res;
        
    }
}