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
    public ListNode middle(ListNode A) {
        ListNode slowPointer = A;
        ListNode fastPointer = A;
        while(fastPointer.next!=null && fastPointer.next.next!=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A==null){
            return B;
        }
        if(B==null){
            return A;
        }
        ListNode head = null;
        ListNode temp = null;
        if(A.val<B.val){
            head = A;
            temp = A;
            A = A.next;
        }
        else{
            head = B;
            temp = B;
            B = B.next;
        }
        while(A!=null && B!=null){
            if(A.val<B.val){
                temp.next = A;
                temp = A;
                A = A.next;
            }
            else{
                temp.next = B;
                temp = B;
                B = B.next;
            }
        }
        if(A==null){
            temp.next = B;
        }
        else{
            temp.next = A;
        }
        return head;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middleElement = middle(head);
        ListNode h1 = middleElement.next;
        middleElement.next = null;

        head = sortList(head);
        h1 = sortList(h1);

        ListNode h2 = mergeTwoLists(head, h1);

        return h2;
    }

}