class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int c=numBottles;
        while(numBottles>=numExchange)
        {
            numBottles-=numExchange;
            numExchange+=1;
            c+=1;
            numBottles+=1;
        }
        return c;
    }
}