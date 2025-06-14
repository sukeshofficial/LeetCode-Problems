class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        int n = nums.length;
        // if nums[i] == 0 point the j variable to this ith index
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // if j value is not changed then there are no zero element
        if (j == -1)
            return;

        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}