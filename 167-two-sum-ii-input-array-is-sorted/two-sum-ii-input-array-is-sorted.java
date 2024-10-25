class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(true) {
            if(numbers[i] + numbers[j] > target)
                j--;
            else if(numbers[i] + numbers[j] < target){
                i++;
            }
            else{
                System.out.println("hamza");

                return new int[]{i+1,j+1};
            }
        }
    }
}