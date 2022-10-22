package deque;

class Deque {
	int arr[];
	int size, cap, front;
	
	
	Deque(int c) {
		arr = new int[c];
		cap = c;
		 front = 0;
		 size = 0;
	}
	
	boolean isFull() {
		return (size == cap);
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	void insertFront(int x) {
		if(isFull()) return;
		front = (front+cap-1)%cap;
		arr[front] = x;
		size++;
	}
	
	void deleteFront() {
		if(isEmpty()) return;
		front = (front+1)%cap;
		size--;
	}
	
	void insertRear(int x) {
		if(isFull()) return;
		int newRear = (front+size)%cap;
		arr[newRear] = x;
		size++;
	}
	
	int deleteRear() {
		if(isEmpty()) return -1;
		else return arr[--size];
	}
	
	int getFront() {
		if(isEmpty()) return -1;
		else return arr[front];
	}
	
	int getRear() {
		if(isEmpty()) return -1;
		else return arr[(front+size-1)%cap];
	}
	
}

public class EfficientArrayImplementation {

	public static void main(String[] args) {
		Deque dq = new Deque(6);
		dq.insertFront(10);
		dq.insertFront(78);
		dq.insertFront(89);
		dq.insertFront(45);
		dq.insertFront(7);
//		dq.deleteFront();
		dq.insertFront(89);
		System.out.println(dq.getFront());
//		while(!dq.isEmpty()) {
//			System.out.println(dq.getRear());
//		}

	}

}
