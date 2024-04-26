class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        hold = []
        for item in nums[0]:
            j = 0
            for arr in nums[1:]:
                if item in arr:
                    j+=1
            if j == len(nums) - 1:
                hold.append(item)
        hold.sort()
        return hold


        