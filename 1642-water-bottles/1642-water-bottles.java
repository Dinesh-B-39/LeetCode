class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int c=numBottles;
       
        int k1=numBottles;
        int k2=numExchange;
        while((k1/k2)!=0)
        {
            int n1=k1/k2;
            int n2=k1%k2;
            c+=n1;
            k1=n1+n2;
        }
        return c;
    }
}