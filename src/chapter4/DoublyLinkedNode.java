package chapter4;

public class DoublyLinkedNode {
	private Integer data;
	private DoublyLinkedNode nextNode;
	private DoublyLinkedNode previousNode;

	public DoublyLinkedNode(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}
	
	public DoublyLinkedNode getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(DoublyLinkedNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public DoublyLinkedNode getPreviousNode() {
		return previousNode;
	}
	
	public void setPreviousNode(DoublyLinkedNode prevNode) {
		this.previousNode = prevNode;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}

}
