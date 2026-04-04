class Solution {
    public String decodeCiphertext(String text, int row) {
        int col=text.length()/row;
        StringBuilder sb=new StringBuilder();
        // int s=0;
        // int tar=col-1;
    //    for(int i=col-1;i>=0;i--)
    //    {
    //     if(text.charAt(i)!=' ')
    //     {
    //         tar=i+1;
    //         break;
    //     }
    //    }
    //    for(int i=0;i<text.length();i++)
    //    {
    //     if(text.charAt(i)==' ')
    //     {
    //         s+=1;
    //     }
    //    }
    //     System.out.println(text.length());
        for(int z=0;z<col;z++)
          {
            for(int i=z;i<text.length();i=i+col+1)
            {
                sb.append(text.charAt(i));
            }
    }
    int fin=sb.length();
    for(int i=sb.length()-1;i>=0;i--)
    {
        if(sb.charAt(i)!=' ')
        {
            fin=i+1;
            break;
        }
    }
        return sb.toString().substring(0,fin);
    }
}