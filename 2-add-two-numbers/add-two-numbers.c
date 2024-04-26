/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 #include <stdlib.h>
void addback(struct ListNode **lst, struct ListNode *node)
{
    struct ListNode *tmp;
    if(*lst == NULL)
    {
        *lst = node;
        return;
    }
    tmp = *lst;
    while(tmp->next != NULL)
        tmp =tmp->next;
    tmp->next = node;
}
 struct ListNode* newnode(int val)
 {
     struct ListNode *node;
     node  = malloc(sizeof(struct ListNode));
     node->val = val;
     node->next = NULL;
     return node;
 }
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2)
{
    typedef struct ListNode list;
    int rem = 0;
    int sum;
    list *rlist;
    rlist =NULL;
    list *p1;
    list *p2;
    p1 = l1;
    p2 = l2;
    while(p1 != NULL || p2 != NULL || rem != 0)
    {
        sum = 0;
        if(p1 != NULL && p2 != NULL)
        {
             sum = p1->val + p2->val;
             p1 = p1->next;
             p2 = p2->next;
        }
        else if(p1 != NULL)
        {
            sum = p1->val;
            p1 = p1->next;
        }
        else if(p2 != NULL)
        {
            sum = p2->val;
            p2 = p2->next;
        }
        sum = sum + rem;
        rem = sum / 10;
        sum = sum % 10;
        addback(&rlist,newnode(sum));
    }
    return (rlist);
}