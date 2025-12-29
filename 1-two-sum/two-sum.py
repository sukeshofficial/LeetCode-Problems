class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        previousNums = {} # val : index

        for i, n in enumerate(nums):
            difference = target - n
            if difference in previousNums:
                return [previousNums[difference], i]
            previousNums[n] = i
        
        return