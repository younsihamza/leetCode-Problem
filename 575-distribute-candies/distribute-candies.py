class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        hold = set(candyType)
        if len(candyType) / 2 < len(hold):
            return int(len(candyType)/2)
        return len(hold);