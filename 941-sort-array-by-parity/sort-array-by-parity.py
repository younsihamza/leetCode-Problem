class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        hold = []
        for item in nums : 
            if item % 2 == 0 : 
                hold.append(item)
        for item in nums : 
            if item % 2 != 0 : 
                hold.append(item)
        return hold        