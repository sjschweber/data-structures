
public class DoublyLinkedOrderedList<T> implements Comparable<T> {
	
	private DoublyLinkedNode<T> head;
	
	public DoublyLinkedOrderedList(){
		
		this.head = null;
		
	}
	
	public DoublyLinkedOrderedList(DoublyLinkedNode<T> head){
		
		this.head = head;
		
	}
	
	public DoublyLinkedNode<T> getHead(){
		
		return this.head;
		
	}
	
	
	public void insert(T data){
		
		DoublyLinkedNode<T> newNode = new DoublyLinkedNode<T>(data);
		DoublyLinkedNode<T> curr = this.head;
		
		if(curr == null){
			
			this.head = newNode;
			
		}else{
			
			while(curr.compareTo((T) newNode) < 0){
				
				curr = curr.getNext();
				
			}
			
			DoublyLinkedNode<T> prev = curr.getPrev();
			DoublyLinkedNode<T> next = curr.getNext();
			
			if(prev == null){
				
				this.head = newNode;
				
			}else{
				
				prev.setNext(newNode);
				newNode.setPrevious(prev);
			}
			
			newNode.setNext(curr);
			curr.setPrevious(newNode);
			
		}
	}
	
	@Override
	public int compareTo(T o) {
		
		if(this.compareTo(o) > 0){
			return 1;
		}
		else if(this.compareTo(o) < 0){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	public void delete(T data){
		
		DoublyLinkedNode<T> curr = this.head;
		
		while(curr != null){
			
			if(curr.getData() == data){
				
				curr.getPrev().setNext(curr.getNext());
				curr.getNext().setPrevious(curr.getPrev());
				
			}
		}
	}
	
	public String toString(){
		
		String ret = "";
		DoublyLinkedNode<T> curr = this.head;
		
		while(curr != null){
			
			if(curr == this.head){
				
				ret += "" + curr.getData();
				
			}else{
				
				ret += ", "+ curr.getData();
				
			}
			curr = curr.getNext();
		}
		
		return ret;
	}
	
	
}
