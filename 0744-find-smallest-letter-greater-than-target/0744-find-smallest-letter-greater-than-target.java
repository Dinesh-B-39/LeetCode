class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int z=target-'a';
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]-'a'>z)
            {
                return letters[i];
            }
        }
        return letters[0];
    }
}