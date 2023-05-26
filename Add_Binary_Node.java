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
