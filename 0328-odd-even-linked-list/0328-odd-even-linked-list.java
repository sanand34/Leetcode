/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=head;
        ListNode even=new ListNode(0);
        ListNode temp=even;
        if(odd==null || odd.next==null || odd.next.next==null) return head;
       
        while(odd.next!=null && odd.next.next!=null){
            even.next=odd.next;
            even=even.next;
            odd.next=odd.next.next;
            odd=odd.next;
        }
       
        if(even.next.next!=null) 
            even.next=even.next.next;
        else
            even.next=null;
  
        odd.next=temp.next;
        return head;
        
    }
}