
public class Main <T>{
	
	public static void main (String[] args){
		
		//SinglyLinkedList tests
		
		SinglyLinkedNode<Integer> firstNode = new SinglyLinkedNode<Integer>(1);
		SinglyLinkedNode<Integer> secondNode = new SinglyLinkedNode<Integer>(2);
		
		firstNode.setNext(secondNode);
		
		SinglyLinkedList testList = new SinglyLinkedList(firstNode);
		testList.regularInsert(3);
		testList.regularInsert(9);
		
		
		System.out.println("Singley Linked List: ");
		System.out.println(testList.toString());
		System.out.println(testList.size());
		System.out.println(testList.getHead());
		
		
		//DoublyLinkedList tests
		
		DoublyLinkedNode<Integer> x = new DoublyLinkedNode<Integer>(100);
		DoublyLinkedNode<Integer> y = new DoublyLinkedNode<Integer>(2);
		DoublyLinkedNode<Integer> z = new DoublyLinkedNode<Integer>(300);
		
		DoublyLinkedOrderedList testList1 = new DoublyLinkedOrderedList(x);
		
		testList1.insert(y);
		testList1.insert(z);
		
		System.out.println(testList1.toString());
		
	}
}
