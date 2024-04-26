void sortColors(int* nums, int numsSize){

    int i = 0;
    int j = 0;
    int tmp;
    while(i < numsSize - 1)
    {
        j = i  + 1; 
        while(j < numsSize)
        {
            if(nums[i] > nums[j])
            {
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
            j++;
        } 
        i++;
    }
}