public class ArrayBasedStack {
	private Object[] array; // Container for Stack elements
	private int top; // Index of top element
	// Constructor for creating stack of given capacity
	public ArrayBasedStack(int capacity) {
		array = new Object[capacity];
		top = -1;
	}	
	// Method for adding a new element to top of stack
	public void push(Object obj) throws Exception {
		if(size() == array.length) {
			throw new Exception("Stack is full!");
		}
		top++; // Advance to next cell
		array[top] = obj; // Add new element
	}
	// Method for removing element from top of stack
	public Object pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty!");
		}		
		Object toReturn = array[top]; // Element to return
		array[top] = null; // Replace it with null
		top--; // Update top to point to new top
		return toReturn;
	}
	// Method for getting top element without removing it
	public Object top() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty!");
		}
		return array[top];
	}
	public int size() {
		return top + 1;
	}
	public boolean isEmpty() {
		return (top == -1);
	}
}
