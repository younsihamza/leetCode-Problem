class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] hold = new int[nums.length];
        Arrays.fill(hold,1);
        int prefix = 1;
        int suffix = 1;
        for(int i = 0 ; i < nums.length; i++) {
            hold[i] = prefix;
            prefix *= nums[i];
        }
        for(int i = nums.length - 1 ; i >= 0; i--) {
            hold[i] *= suffix;
            suffix *= nums[i];
        }
        return hold;
    }
}