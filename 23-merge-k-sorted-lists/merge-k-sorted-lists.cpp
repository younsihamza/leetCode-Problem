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
 #include <algorithm>

class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        vector<int> holdNumber;
        ListNode *help = NULL;
        ListNode *list = NULL;
        ListNode *newNode = NULL;
        vector<ListNode*>::iterator it;

        for(it = lists.begin() ; it != lists.end() ; it++)
            for(help = *it; help != NULL; help = help->next)
                holdNumber.push_back(help->val);

        std::sort(holdNumber.begin(),holdNumber.end());
        std::reverse(holdNumber.begin(),holdNumber.end());

        for(int i = 0;i < holdNumber.size() ; i++)
            newNode = new ListNode(holdNumber.at(i),newNode);
        return newNode;

        
    }
};