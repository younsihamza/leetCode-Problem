class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int second = -1;
        for(int i = 0; i < nums.length;i++){
            if(target == nums[i]){
                first = i;
                break;
            }
        }
        for(int i = nums.length - 1; i >= 0;i--){
            if(target == nums[i]){
                second = i;
                break;
            }
        }
        int[] a = {first,second};
    return a;
    }
}