class Solution {
    // maxReach = 3 + 0 = 3
    // maxReach = 2 + 1 = 3 
    // maxReach = 1 + 2 = 3
    // maxReach = 0 + 3 = 3

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;

        for (int i = 0; i < n; i++) {
            if(i > maxReach) return false;

            maxReach = Math.max(maxReach, nums[i] + i);
        }

        return true;
    }
}