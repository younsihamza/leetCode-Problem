/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func deleteDuplicates(head *ListNode) *ListNode {
    if head == nil {
        return nil
    }
    var hold *ListNode = head
    var tmp *ListNode =  head.Next
    value := head.Val
    for tmp != nil {
        if tmp.Val == value {
            tmp = tmp.Next
        }else {
            hold.Next = tmp
            hold =  hold.Next
            value = hold.Val
            fmt.Println(value)
            tmp = tmp.Next
        }
    }
    hold.Next  = tmp
    return head
}