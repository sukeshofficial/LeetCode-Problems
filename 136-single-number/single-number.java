class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e: hash.entrySet()) {
            if(e.getValue() == 1) {
                return e.getKey();
            }
        }

        return -1;
    }
}