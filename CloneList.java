/*
If the head of the given list is null then return head
Create a current reference and set it to hold the head of the list
Create a dummy node and initialize a tail reference with it
While current is not null:
Create a new node with the same value as current node
Attach the new node at the end of clone list using tail reference
Set current to hold the next node in the given list
Return the reference to node 1 step after the dummy node. It is the head of the clone list

*/

class Solution {
    public ListNode cloneAList(ListNode head) {
        ListNode clone=new ListNode(-1);
        ListNode tail=clone;

        while(head!=null){
            tail.next=new ListNode(head.val);
            head=head.next;
            tail=tail.next;
        }
        return clone.next;
    }
}
