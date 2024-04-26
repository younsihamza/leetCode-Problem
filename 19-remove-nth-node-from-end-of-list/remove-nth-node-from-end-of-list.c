/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n)
{
    struct ListNode* tmp =NULL;
    struct ListNode* plast =NULL;
    int  i = 0;
    int j = 0;
    
    tmp = head ;
     while(tmp != NULL)
        { 
            i++;
            tmp =tmp-> next ;
        }
    if (n == i)
    {
        head =head->next;
        free(tmp);
        return head;
    }
        tmp =head ;
    while(j < i - n)
    {
        if(j == i-n-1)
            plast = tmp ;
        tmp =tmp->next ;
        j++;
    }
    plast->next = tmp->next;
    free(tmp);
    return (head);
}
   