
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                mul *= num;
            }
        }

        if (zeroCount > 1) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = 0;
            }
            return nums;
        }

        if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (nums[i] == 0) ? mul : 0;
            }
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = mul / nums[i];
        }

        return nums;
    }
}
