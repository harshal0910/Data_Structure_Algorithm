class Solution {
    public ListNode insertAtTheBeginning(ListNode head, int data) {
            ListNode newNode=new ListNode(data);
            if(head!=null){
                newNode.next=head;
            }
            return newNode;
    }
}
