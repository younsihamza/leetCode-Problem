class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> resulet(nums1.size() + nums2.size());
        std::merge(nums1.begin(),nums1.end(),nums2.begin(),nums2.end(),resulet.begin());
        if(resulet.size() % 2 != 0)
            return (*(resulet.begin() + static_cast<int>(resulet.size() / 2)));
        else 
            return ((*(resulet.begin() + (resulet.size() / 2)) + *(resulet.begin() + (resulet.size() / 2) -1) ) / static_cast<double>(2));
    }
};