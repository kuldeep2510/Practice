class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int icnt=0;
        for(int i=0;i<patterns.length;i++)
        {
            if(word.contains(patterns[i]))
            {
                icnt++;
            }
            
        }
        return icnt;
        
    }
}