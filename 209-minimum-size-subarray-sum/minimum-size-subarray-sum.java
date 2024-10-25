class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currentIndex = 0;
        int leftIndex = -1;
        int len = nums.length;
        int minSubarray = len * 2;
        int sum = 0;
        for(; currentIndex < len ; currentIndex++ ) {
            sum += nums[currentIndex];
            if(sum >= target) {
                minSubarray = Math.min(minSubarray,(currentIndex + 1 - (leftIndex + 1)));
                leftIndex++;
                sum -= nums[leftIndex];
            }
            while(sum >= target && currentIndex >= leftIndex) {
                minSubarray = Math.min(minSubarray,(currentIndex + 1 - (leftIndex + 1)));
                leftIndex++;
                sum -= nums[leftIndex];
            }
        }
        return (minSubarray == len * 2 ? 0:minSubarray);
    }
}