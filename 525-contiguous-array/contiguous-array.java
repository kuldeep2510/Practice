class Solution {
    public int findMaxLength(int[] nums) {

                //sum    index
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        int sum=0;
        int ans=0;

        map.put(0,-1);

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                sum+= -1;
            }
            else if(nums[i]==1)
            {
                sum+= 1;
            }

            if(map.containsKey(sum))
            {
                int prev_idx=map.get(sum);

                int len=i-prev_idx;

                if(len>ans)
                {
                    ans=len;
                }
            }
            else
            {
                map.put(sum,i);
            }
        }

        return ans;
        


        
    }
}