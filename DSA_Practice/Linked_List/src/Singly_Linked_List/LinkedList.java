package Singly_Linked_List;

public class LinkedList {
	private Node head;

	public LinkedList() {
		this.head = null;
	}
	
	public boolean insert(int data) {
		
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return true;
		}
		Node temp=head;
		while(temp.getNext()!=null) 
			 {
				temp=temp.getNext();	
			}
		temp.setNext(newNode);
		return true;
	}
	
	
	
	public boolean insertAtPosition(int data,int pos) {
		
		if(head==null) {
			return false;
		}
		
		if(pos<=0) {
			return false;
		}
		Node newNode=new Node(data);
		if(pos==1) {
			newNode.setNext(head);
			head=newNode;
			return true;
		}
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
			if(prev==null)
				return false;
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}
	
	public boolean deleteByValue(int data) {
		
		Node prev=head,del=head;
		if(head.getData()==data) {
			head=head.getNext();
			return true;
		}
		while(del.getData()!=data) {
			prev=del;
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}
	
	public boolean deleteByPosition(int pos) {
		Node prev=head;
		
		if(pos==1) {
			head=head.getNext();
			return true;
		}
		
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
			if(prev==null) {
				return false;
			}
		}
		Node del=prev.getNext();
		prev.setNext(del.getNext());
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
	
	public void display(Node head) {
		Node temp=head;
		display(temp.getNext());
		System.out.println(temp.getData());
	}

}
