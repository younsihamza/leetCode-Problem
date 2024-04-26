int searchInsert(int* nums, int numsSize, int target)
{
    int i;
    int tmp;
    i = numsSize -1;
    tmp = numsSize;
    while(i >= 0)
    {
        if(nums[i] >= target)
            tmp = i;
        i--;
    }
    return(tmp);
}