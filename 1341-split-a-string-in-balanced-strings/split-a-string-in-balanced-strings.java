class Solution {
    public int balancedStringSplit(String s) {


        int left=0;
        int right=0;
        int icnt=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                right++;
            }
            else
            {
                left++;
            }


            if(right==left)
            {
                icnt++;
            }
        }

        return icnt;
        
    }
}