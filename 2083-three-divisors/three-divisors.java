class Solution {
    public boolean isThree(int n) {

        int icnt=0;
        boolean stat=false;
        int i=1;

        for(;i<=n;i++)
        {
            if(n%i==0)
            {
                icnt++;
            }
        }

        if(icnt==3 && (n+1)==i)
        {
            stat=true;
        }

        return stat;
        
    }
}