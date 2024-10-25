class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        int lineSize = 0;
        while(i < j) {
            lineSize = Math.min(height[i],height[j]);
            max = Math.max(max, lineSize*(j-i));
            if(height[i] > height[j])
                j--;
            else
                i++;
        }
        return max;
    }
}