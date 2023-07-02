package Doubly_Linked_List;

public class Main {
	public static void main(String[] args) {
		
		Linked_List l2=new Linked_List();
		
		l2.insert(10);
		l2.display();
		l2.insert(20);
		l2.display();
		l2.insert(30);
		l2.display();
		l2.insertAtPosition(50, 1);
		l2.display();
		l2.insertAtPosition(70, 2);
		l2.display();
		l2.insertAtPosition(80, 5);
		l2.display();
		l2.deleteByVal(80);
		l2.display();
		l2.deleteByVal(50);
		l2.display();
	}
}
