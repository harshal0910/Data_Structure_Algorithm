/* Algorithm
Set current = head
If current != null and current.next != null 
go to step 3 else go to step 8
current = current.next
Go to step 2
newNode = new node with the given value
newNode.next = null
current.next = newNode
*/

class Solution {
    public ListNode insertAtTheEnd(ListNode head, int data) {
        if(head==null){
            head=new ListNode(data);
            head.next=null;
            return head;
        }
        ListNode current=head;
        while(current!=null&&current.next!=null){
            current=current.next;
        }
        ListNode newNode=new ListNode(data);
        newNode.next=null;
        current.next=newNode;

    return head;
    }
}
