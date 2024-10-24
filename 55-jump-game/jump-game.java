class Solution {
    public boolean canJump(int[] nums) {
        int currentStap = 0;
        for(int i = 0; i < nums.length-1; i++) {
            if(currentStap < nums[i]) 
                currentStap = nums[i];
            else if(currentStap == 0)
                return false;
            currentStap--;
        }
        return true;
    }
}