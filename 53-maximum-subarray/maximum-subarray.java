class Solution {
    public int maxSubArray(int[] nums) {

        int cur_sum=0;
        int final_ans=Integer.MIN_VALUE;
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            cur_sum+=nums[i];

            final_ans=Math.max(final_ans,cur_sum);

            if(cur_sum<0)
            {
                cur_sum=0;
            }

        }
        return final_ans;

        
    }
}