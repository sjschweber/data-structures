public class SinglyLinkedList <T>{
	
	private SinglyLinkedNode<T> head;
	private int size = 0;
	
	public SinglyLinkedList(){
		
		this.head = null;
		
	}
	
	public SinglyLinkedList(SinglyLinkedNode<T> head){
		
		this.head = head;
		this.size++;
		
		//check if the head is pointing to another node.
		//If it is then increase size.
		SinglyLinkedNode<T> curr = this.head;
		while(curr.getNext() != null){
			curr = curr.getNext();
			this.size++;
		}
		
	}
	
	public SinglyLinkedNode<T> getHead(){
		
		return this.head;
		
	}
	
	public void regularInsert(T data){
		
		SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>(data);
		SinglyLinkedNode<T> curr = this.head;
		
		if(this.head == null){
			
			this.head = newNode;
			
		}else{
			
			while(curr.getNext() != null){
				
				curr = curr.getNext();
			}
			
			curr.setNext(newNode);
		}
		
		this.size++;
	}
	
	public void remove(T data){
		
		SinglyLinkedNode<T> curr = this.head;
		
		if(curr.getData() == data){
			
			this.head = curr.getNext();
			
		}
		while(curr.getNext() != null){
			
			if(curr.getNext().getData() == data){
				
				curr.setNext(curr.getNext().getNext());
				
			}else{
				
				curr = curr.getNext();
			}
		}
	}
	public int size(){
		
		return this.size;
		
	}
	
	public String toString(){
		
		String retString = "";
		SinglyLinkedNode<T> curr = this.head;
		
		while(curr != null){
			
			if(curr == this.head){
				
				retString += "" + curr.getData();
				
			}else{
				
				retString += ", " + curr.getData();
				
			}
			
			curr = curr.getNext();
		}
		
		return retString;
	}
}
