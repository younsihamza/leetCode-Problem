/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

 struct TreeNode *create_node_tree(int  val)
{
    struct TreeNode *new_node = malloc(sizeof(struct TreeNode));
    new_node->val = val;
    new_node->left = NULL;
    new_node->right = NULL;
    return(new_node);
}
struct TreeNode* insertIntoBST(struct TreeNode* root, int val)
{
    if(root == NULL)
        root = create_node_tree(val);
    else if(root->val > val)
        root->left = insertIntoBST(root->left,val);
    else 
        root->right = insertIntoBST(root->right,val);
    return(root);
}