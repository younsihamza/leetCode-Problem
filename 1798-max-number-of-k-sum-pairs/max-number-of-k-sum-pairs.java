import java.util.Arrays;
class Solution {
    public int maxOperations(int[] nums, int k) {
        int i = 0;
        int j = nums.length -1;
        Arrays.sort(nums);
        int eq = 0;
        while(i < j) {
            if(nums[i] + nums[j] > k)
                j--;
            else if(nums[i] + nums[j] < k)
                i++;
            else {
                eq+= 1;
                i++;
                j--;
            }
        }
    return eq;
    }
}