class Solution {
    public int longestOnes(int[] nums, int k) {

        int zero_cnt=0;
        int l=0;
        int ans=0;

        for(int r=0;r<nums.length;r++)
        {
            //include the rth element
            if(nums[r]==0)
            {
                zero_cnt++;
            }

            //because we include the rth element ,it might have made the window
            while(zero_cnt>k)
            {
                if(nums[l]==0)
                {
                    zero_cnt--;
                }
                    l++;
            }
            ans=Math.max(ans,r-l+1);

        }
        return ans;
        
    }
}