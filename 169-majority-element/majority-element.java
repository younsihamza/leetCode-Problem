class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int majorSize = 1;
        for ( int i = 0; i < nums.length; i++)
        {
            if (major == nums[i])
                majorSize++;
            else if (major != nums[i]){
                majorSize--;
                if (majorSize == 0){
                    major = nums[i];
                    majorSize = 1;
                }
            }
        }
        return major;

    }
}