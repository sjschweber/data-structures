
public class DoublyLinkedNode<T> implements Comparable<T> {
	
	private T data;
	private DoublyLinkedNode<T> next;
	private DoublyLinkedNode<T> previous;
	
	public DoublyLinkedNode(T data){
		
		this.data = data;
		
	}
	
	public T getData(){
		
		return this.data;
		
	}
	
	public void setNext(DoublyLinkedNode<T> nextNode){
		
		this.next = nextNode;
		
	}
	
	public void setPrevious(DoublyLinkedNode<T> prevNode){
		
		this.previous = prevNode;
		
	}
	
	public DoublyLinkedNode<T> getNext(){
		
		return this.next;
		
	}
	
	public DoublyLinkedNode<T> getPrev(){
		
		return this.previous;
		
	}
	
	public String toString(){
		
		return this.data.toString();
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
	
}
