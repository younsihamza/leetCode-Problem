class Solution {
public:
    vector<int> sortArray(vector<int>& nums) 
    {
           vectorDive(nums);
           return nums;
    }

    void vectorDive(vector<int>& nums)
    {
        int sizeEach;
        vector <int> a;
        vector <int> b;
        size_t numsSize = nums.size();
        size_t i;
        if(numsSize <= 1)
            return;
        sizeEach = numsSize / 2;
        a.insert(a.begin(),nums.begin(), nums.begin()+ sizeEach);
        b.insert(b.begin(),nums.begin()+ sizeEach , nums.end());
        vectorDive(a);
        vectorDive(b);
        merge(nums , a,b);
    }
    void merge(vector<int>& nums ,vector <int>& a, vector <int>& b)
    {
        size_t sizeA = a.size();
        size_t sizeB = b.size();
        int IndexA =0;
        int IndexB =0;

        for(size_t i  = 0 ; i < nums.size() ; i++ )
        {
            if(sizeA  == IndexA)
            {
                nums.at(i) = b.at(IndexB);
                IndexB++;
            }
            else if(sizeB == IndexB) 
            {
               nums.at(i) = a.at(IndexA);
                IndexA++;
            }
            else
            {
                if(a.at(IndexA) > b.at(IndexB))
                {
                    nums.at(i) = b.at(IndexB);
                    IndexB++;
                }else 
                {
                    nums.at(i) = a.at(IndexA);
                    IndexA++;
                }
            }
        }
        
    }
};