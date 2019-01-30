package chapter4;

public class DoublyLinkedList {
	
	private DoublyLinkedNode head;

	public DoublyLinkedNode getHead() {
		return this.head;
	}

	protected void setHead(DoublyLinkedNode head) {
		this.head = head;
	}

	public boolean isHead(DoublyLinkedNode node) {
		return this.head == node;
	}

	public void insertAtHead(Integer data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		newNode.setNextNode(this.head);
		if (this.head != null) {
			this.head.setPreviousNode(newNode);
		}
		this.head = newNode;
	}

	public int length() {
		if (head == null)
			return 0;
		int length = 0;
		DoublyLinkedNode curr = this.head;
		while (curr != null) {
			length += 1;
			curr = curr.getNextNode();
		}
		return length;
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DoublyLinkedNode n = this.head;
		while (n != null) {
			sb.append("Node data: ");
			sb.append(n);
			sb.append("\n");
			n = n.getNextNode();
		}
		return sb.toString();
	}
}
