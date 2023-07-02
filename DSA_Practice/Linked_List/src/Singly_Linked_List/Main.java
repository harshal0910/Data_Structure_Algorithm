package Singly_Linked_List;

public class Main {
	public static void main(String []args) {
		
		LinkedList l1=new LinkedList();
		l1.insert(10);
		l1.display();
		l1.insert(20);
		l1.display();
		l1.insert(30);
		l1.display();
//		l1.insertAtPosition(30, 2);
//		l1.display();
//		l1.insertAtPosition(40, 4);
//		l1.display();
//		l1.insertAtPosition(70, 5);
//		l1.display();
//		l1.deleteByValue(10);
//		l1.display();
//		l1.deleteByValue(70);
//		l1.display();
		l1.deleteByPosition(2);
		l1.display();
		l1.deleteByPosition(1);
		l1.display();
	}
}
