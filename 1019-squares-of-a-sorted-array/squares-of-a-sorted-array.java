class Solution {
    public int[] sortedSquares(int[] nums) {
        int no=0;
        for(int i=0;i<nums.length;i++)
        {
            no=Math.abs(nums[i]);
            nums[i]=no*no;
        }

        Arrays.sort(nums);

        return nums;
        
    }
}