package chapter5;

public class Stack {
	private int[] items = new int[100];
	private int top = -1; //index to keep track of the topmost element
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public void push(int item) {
		if (top == items.length-1)
			throw new RuntimeException("Stack is full");
		items[++top] = item;
	}
	
	/**
	 * Returns the topmost item and removes it
	 * @return
	 */
	public int pop() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty");
		return items[top--];
	}

	/**
	 * Returns the topmost item without removing it
	 * Peek and Pop methods should ideally be invoked after checking that the stack is not empty
	 * either in a 'if' condition or a 'while' loop
	 * @return
	 */
	public int peek() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty");
		return items[top];
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println(stack.isEmpty());
		stack.push(5);
		stack.push(4);
		stack.push(6);
		stack.push(10);
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
