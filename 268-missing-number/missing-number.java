class Solution {
    public int missingNumber(int[] nums) {
        /* Sum of 'n' numbers
         * 
         * sum = n * (n - 1) / 2
         * 
         * ans = sum - sum(arr elements)
         */

        int n = nums.length + 1;
        int sum = (n * (n - 1)) / 2;
        int sum_arr = 0;
        for(int i = 0; i < n - 1; i++) {
            sum_arr += nums[i];
        }

        return (sum - sum_arr);
    }
}