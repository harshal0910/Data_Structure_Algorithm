package Doubly_Linked_List;

public class Linked_List {
	
	private Node head;
	
	public Linked_List() {
		// TODO Auto-generated constructor stub
		this.head=null;
	}
	
	public boolean insert(int data) {
		
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return true;
		}
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		newNode.setPrev(temp);
		return true;
	}
	
	public boolean insertAtPosition(int data,int pos) {
		
		Node newNode=new Node(data);
		if(pos<=0||(head==null&&pos>1)) {
			return false;
		}
		if(pos==1) {
			if(head==null) {
				head=newNode;
				return true;
			}
			newNode.setNext(head);
			head.setPrev(newNode);
			head=newNode;
			return true;
		}
		Node temp=head;
		for(int i=1;i<pos-1;i++) {
			temp=temp.getNext();
			if(temp==null)
				return false;
		}
		
		Node newNext=temp.getNext();
		newNode.setPrev(temp);
		temp.setNext(newNode);
		if(newNext!=null) {
			newNode.setNext(newNext);
			newNext.setPrev(newNode);
		}
		return true;
		
	}
	
//	public boolean deleteByValue(int data) {
//		if(head.getData()==data) {
//			head=head.getNext();
//			if(head!=null)
//				head.setPrev(null);
//			return true;
//		}
//		
//		Node del=head;
//		while(del.getData()!=data) {
//			del=del.getNext();
//			if(del==null) {
//				return false;
//			}
//		}
//		
//		Node pre=del.getPrev();
//		Node ne=del.getNext();
//		
//		pre.setNext(ne);
//		if(ne!=null) {
//			ne.setPrev(pre);
//		}
//		
//		return true;
//		}
	
	public boolean deleteByVal(int data) {
        if(head == null) {
            return false;
        }

        if(head.getData() == data) {
            head = head.getNext();
            if(head != null) {
                head.setPrev(null);
            }
            return true;
        }

        Node del = head;
        while(del.getData() != data) {
            del = del.getNext();
            //System.out.println(del.getData());
           // System.out.println("---");
//            if(del == null) {
//                return false;
//            }
        }

        /*del.getPrev().setNext(del.getNext());
        if(del.getNext() != null) {
            del.getNext().setPrev(del.getPrev());
        }*/
        //System.out.println(del.getPrev().getPrev().getData());
        Node prev = del.getPrev();
        Node next = del.getNext();
        prev.setNext(next);
        
        
        if(next != null) {
            next.setPrev(prev);
        }
        return true;
    }
	
	public void display() {
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
}
