class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        while(len(stones) > 1):
            stones.sort();
            if(stones[-1]== stones[-2]):
                stones = stones [0:-2]
            else:
                hold = stones[-1] - stones[-2]
                stones = stones [0:-2]
                stones.append(hold)
        if len(stones) == 0:
            return 0
        return stones[0] 