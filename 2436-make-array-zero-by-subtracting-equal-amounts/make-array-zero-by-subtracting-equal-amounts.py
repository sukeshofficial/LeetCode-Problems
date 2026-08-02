class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        return len(set(nums) - {0}) # {1, 5, 0, 3} - {0} -> {1, 5, 3} = 3
                                    # [0] -> {0} -> {0} - {0} = 0