
public class SinglyLinkedNode <T> {
	
	private T data;
	private SinglyLinkedNode<T> next;
	
	public SinglyLinkedNode(T data){
		
		this.data = data;
	}
	
	public Object getData(){
		
		return this.data;
		
	}
	
	public void setNext(SinglyLinkedNode<T> nextNode){
		
		this.next = nextNode;
	}
	
	public SinglyLinkedNode<T> getNext(){
		
		if(this.next == null){
			
			return null;
			
		}else{
			
			return this.next;
		}
		
	}
	
	public String toString(){
		
		return this.data.toString();
	}
}
