package chapter4;

public class SortedLinkedList<T extends Comparable<T>> {
	private Node<T> head;

	public void insert(T data) {
		Node<T> newNode = new Node<T>(data);
		if (this.head == null || this.head.getData().compareTo(data) > 0) {
			newNode.setNextNode(this.head);
			this.head = newNode;
			return;
		}
		Node<T> current = this.head;
		while (current != null && current.getNextNode() != null
				&& current.getNextNode().getData().compareTo(data) < 0) {
			current = current.getNextNode();
		}
		newNode.setNextNode(current.getNextNode());
		current.setNextNode(newNode);
	}

	public Node<T> getHead() {
		return this.head;
	}

	@Override
	public String toString() {
		String result = "[";
		Node<T> current = this.head;
		while (current != null) {
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		result += "]";
		return result;
	}

	public static void main(String[] args) {
		SortedLinkedList<Integer> sll = new SortedLinkedList<Integer>();
		sll.insert(6);
		sll.insert(4);
		sll.insert(2);
		sll.insert(8);
		sll.insert(3);
		sll.insert(5);
		System.out.println(sll);
	}

}
