// 1. In one traversal : using slow and fast pointer
/*
take two pointer slow and fast
- fast will move n position forwards
- now move forwards slow and fast both, till fast not reach to end of LL
- after performing upper operations, slow will reach to the previous node to the node which we want to delete
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode slow = head, fast = head;
        
        // move fast n position forwards
        while(n != 0){
            fast = fast.next;
            n--;
        }
        
        // now move slow and fast both till fast not reach to end of LL
        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        // if fast is null, its mean we want to delete head node
        if(fast == null) return head.next;
        
        // remove node
        slow.next = slow.next.next;
        
        return head;
    }
}


