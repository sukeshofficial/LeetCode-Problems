class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        sortColors(nums, low, high);
    }

    public void sortColors(int[] nums, int low, int high) {
        if (low < high) {
            int partition = partition(nums, low, high);
            sortColors(nums, low, partition - 1);
            sortColors(nums, partition + 1, high);
        }
    }

    int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (nums[i] <= pivot && i < high) {
                i++;
            }

            while (nums[j] > pivot && j >= low) {
                j--;
            }

            if(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }

}