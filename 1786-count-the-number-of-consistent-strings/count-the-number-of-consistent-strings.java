class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        Set<Character> set=new HashSet<>();

        for(char ch:allowed.toCharArray())
        {
            set.add(ch);
        }

        int icnt=0;

        for(String word:words)
        {
            boolean isPresent=true;

            

            for(int i=0;i<word.length();i++)
            {
                char currChar=word.charAt(i);
                if(!set.contains(currChar))
                {
                    isPresent=false;
                    break;
                }
            }
            if(isPresent)
            {

            icnt++;
            }

        }

        return icnt;
        
    }
}