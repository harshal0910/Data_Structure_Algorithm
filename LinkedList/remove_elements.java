// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

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
    public ListNode removeElements(ListNode head, int val) {
        // if(head==null){
        //     return head;
        // }
        
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            if(curr.val==val){
                ListNode next = curr.next;
                prev.next=next;
                curr = next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        
        return head;
        
    }
}