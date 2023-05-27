/*
Algorithm to solve this problem

1. check last node is qual to head
2.check first node
3.check last node
4.check both
*/



class Solution {
    public String isBoundaryNode(ListNode head, ListNode node) {
        if(head==null&& node==null)
        {
            return "none";
        }

        boolean isFirst=head==node;
        boolean isLast=false;
        
        if(node!=null&node.next==null){
            isLast=true;
        }
        
        if(isFirst&&isLast){
            return "both";
        }
        else if(isFirst){
            return "first";
        }
        else if(isLast){
            return "last";
        }
        return "none";
    }
}



