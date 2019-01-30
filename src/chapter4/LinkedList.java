package chapter4;

public class LinkedList<T> {

	private Node<T> head;

	public Node<T> getHead() {
		return this.head;
	}

	public void addAtStart(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public void setHead(Node<T> data) {
		this.head = data;
	}

	public Node<T> deleteAtStart() {
		Node<T> toDel = this.head;
		this.head = this.head.getNextNode();
		return toDel;
	}

	public Node<T> find(T data) {
		Node<T> curr = this.head;
		while (curr != null) {
			if (curr.getClass().equals(data)) {
				return curr;
			}
			curr = curr.getNextNode();
		}
		return null;
	}

	public int length() {
		if (head == null)
			return 0;
		int length = 0;
		Node<T> curr = this.head;
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
		String res = "";
		Node<T> curr = this.head;
		while (curr != null) {
			res += curr + ", ";
			curr = curr.getNextNode();
		}
		return res;
	}

}
