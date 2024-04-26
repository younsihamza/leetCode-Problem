/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
        vector<int> holdNumbers;
        ListNode *newList=NULL;

        for(; head != NULL ;head = head->next)
            holdNumbers.push_back(head->val);
    
        for(int i = 0; i + k <= holdNumbers.size();i += k)
             std::reverse(holdNumbers.begin()+i,holdNumbers.begin()+i+k);
        std::reverse(holdNumbers.begin(),holdNumbers.end());

        for(int i = 0; i < holdNumbers.size();i++)
            newList = new ListNode(holdNumbers.at(i),newList);
        return newList;

    }
};