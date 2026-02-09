class Solution {
    public int minimumCardPickup(int[] cards) {
        int mine=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        HashSet<Integer> set=new HashSet<>();
        while(i<cards.length && j<cards.length)
        {
            if(set.contains(cards[j]))
            {
                while(cards[i]!=cards[j])
                {
                    set.remove(cards[i]); 
                    i+=1;
                }
                mine=Math.min(mine,j-i+1);
                // set.add(cards[j]);
                i+=1;
                j+=1;
            }

            else
            {
                set.add(cards[j]);
                j+=1;
            }
        }
        if(mine==Integer.MAX_VALUE)
        {
            return -1;
        }
        return mine;
    }
}