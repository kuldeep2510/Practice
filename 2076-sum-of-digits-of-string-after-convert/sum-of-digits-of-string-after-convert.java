class Solution {
    public int getLucky(String s, int k) {

        String numString="";

        for(char ch:s.toCharArray())
        {
            numString=numString+Integer.toString(ch-'a'+1);
        }

        while (k-->0)
        {
            int sum=0;

            for(char digCh:numString.toCharArray())
            {
                sum=sum+digCh-'0';
            }

            numString=Integer.toString(sum);
            
        }

        return Integer.parseInt(numString);
        
    }
}