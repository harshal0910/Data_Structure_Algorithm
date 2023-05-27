/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 * };
 */

class Solution {
    public int lengthOfTheLinkedList(ListNode head) {
        int count=1;
        ListNode node=head;
        while(node.next!=null){
            count++;
            node=node.next;
        }
        return count;

    }
}
