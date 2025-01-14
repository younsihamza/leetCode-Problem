class Solution {
    private int  binarySearch(int[] nums, int target, int start, int end) {
        if(start >= end)
            return -1;
        int mid =start + (end-end) / 2;
        if(target == nums[mid])
            return mid;
        return (nums[mid]<target ? binarySearch(nums, target, mid+1, end): binarySearch(nums, target, start, mid));
    }
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int second = -1;
        int r = binarySearch(nums,target, 0, nums.length);
        first = r;
        second = r;
        int[] a = {r,r};
        if(r == -1)
            return a;
        for(int i = r; i >= 0;i--){
            if(target != nums[i]){
                break;
            }
            a[0] = i;
        }
        for(int i = r; i < nums.length;i++){
            if(target != nums[i]){
                break;
            }
            a[1] = i;
        }
    return a;
    }
}